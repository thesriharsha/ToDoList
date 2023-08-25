package com.todolist.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "userorganisations")
public class UserOrganisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String status;
    private String createdBy;
    private LocalDateTime joinedOn;
    private LocalDateTime removedOn;

    @ManyToOne
    @JoinColumn(name = "orgId", referencedColumnName = "id")
    @JsonIgnore
    private Organisation organisation;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    @JsonIgnore
    private User user;
}
