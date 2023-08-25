package com.todolist.controllers;

import com.todolist.entities.User;
import com.todolist.rest.ProjectRepo;
import com.todolist.rest.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;



    @GetMapping("/all/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

}
