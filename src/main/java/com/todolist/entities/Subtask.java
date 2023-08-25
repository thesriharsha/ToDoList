package com.todolist.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "subtasks")
public class Subtask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String status;

    @ManyToOne
    @JoinColumn(name = "taskId", referencedColumnName = "id")
    @JsonIgnore
    private Task task;
    
}
