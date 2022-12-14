package com.example.agil427;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@EntityScan
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, optional = false)
    private Team team;



    //SETTER
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    //GETTER
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public Team getTeam() {
        return team;
    }
}
