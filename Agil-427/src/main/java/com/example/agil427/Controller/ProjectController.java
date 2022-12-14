package com.example.agil427.Controller;

import com.example.agil427.Project;
import com.example.agil427.Repositorys.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.agil427.Agil427Application;
import com.example.agil427.Project;
import com.example.agil427.Repositorys.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping(path = "")
    public @ResponseBody ResponseEntity<String> addProject(@Valid @RequestBody Project project){
        projectRepository.save(project);
        return ResponseEntity.ok("Your Project was Successfully addet!")
    }

    @GetMapping(path = "")
    public @ResponseBody Stream<Project> getProjectById(@RequestParam int id){
        List<Project> project = projectRepository.findByProjectId(id);
    }

}
