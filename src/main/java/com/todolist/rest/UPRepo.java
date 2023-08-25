package com.todolist.rest;

import com.todolist.entities.UserProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UPRepo extends JpaRepository<UserProject,Integer> {

}
