package com.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    private String description;
    private LocalDateTime startedOn;

    @ManyToOne
    @JoinColumn(name = "orgId", referencedColumnName = "id")
    @JsonIgnore
    private Organisation organisation;
}
