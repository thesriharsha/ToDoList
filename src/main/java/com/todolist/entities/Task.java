package com.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String status;
    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name = "projId",referencedColumnName = "id")
    @JsonIgnore
    private Project project;

    @ManyToOne
    @JoinColumn(name = "userId" , referencedColumnName = "id")
    @JsonIgnore
    private User user;

}
