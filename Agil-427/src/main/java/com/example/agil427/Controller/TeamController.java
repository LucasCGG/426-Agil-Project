package com.example.agil427.Controller;

import com.example.agil427.Repositorys.TeamRepository;
import com.example.agil427.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  Thi sis the controller for the team entity
 * @see com.example.agil427.Team
 * @see TeamRepository
 * @// TODO: 14/12/2022 test with insomnia
 * @// TODO: 14/12/2022 exception handling
 */

@CrossOrigin
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    /**
     * This method returns a list of user id's in a team by its id
     *
     * @return user id's in a team
     */
    @GetMapping("/{id}")
    public List<User> getTeamById(@PathVariable(value = "id") int id) {
        return teamRepository.findById(id).get().getUsers();
    }
}