package com.example.agil427.Controller;


import com.example.agil427.Agil427Application;
import com.example.agil427.Repositorys.UserRepository;
import com.example.agil427.Team;
import com.example.agil427.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  Thi sis the controller for the team entity
 * @see User
 * @see UserRepository
 * @// TODO: 14/12/2022 test with insomnia
 * @// TODO: 14/12/2022 exception handling
 */

@CrossOrigin
@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * This method returns a user by its id
     * @return user by its id
     */
    @GetMapping(path="/{id}")
    public User getUserById(@PathVariable(value = "id") int id) {
        return userRepository.findById(id).get();
    }

    /**
     * This method adds a user to the database
     * also adds the user to the team with the id
     */
    @PostMapping(path="/addNew")
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam int teamId) {
        User user = new User();
        user.setName(name);
        userRepository.save(user);
        Team.addUserToTeam(user, teamId);
        return "Saved";
    }

    /**
     * Adds a user to a team
     */
    @PostMapping(path="/addToTeam")
    public @ResponseBody String addUserToTeam (@RequestParam int userId, @RequestParam int teamId) {
        User user = userRepository.findById(userId).get();
        Team.addUserToTeam(user, teamId);
        return "Saved";
    }


}
