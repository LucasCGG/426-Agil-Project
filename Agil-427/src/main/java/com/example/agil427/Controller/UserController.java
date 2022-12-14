package com.example.agil427.Controller;


import com.example.agil427.Agil427Application;
import com.example.agil427.Project;
import com.example.agil427.Repositorys.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping(path="/Project")
public class UserController {
    Agil427Application application;


}
