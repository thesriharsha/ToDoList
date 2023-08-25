package com.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "userprojects")
public class UserProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String status;
    private String assignedBy;
    private LocalDateTime assignedOn;
    private LocalDateTime removedOn;

    @ManyToOne
    @JoinColumn(name = "projId", referencedColumnName = "id")
    @JsonIgnore
    private Project project;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    @JsonIgnore
    private User user;
}
