package com.example.agil427.Repositorys;

import com.example.agil427.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProjectRepository extends CrudRepository<Project, Integer>{
    List<Project> findProjectId(int id);
}
