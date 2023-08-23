package com.todolist.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="organisations")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String createdBy;
    private LocalDateTime createdOn;
}
