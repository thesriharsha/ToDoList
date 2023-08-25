package com.todolist.rest;

import com.todolist.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends JpaRepository<Project,Integer> {

}
