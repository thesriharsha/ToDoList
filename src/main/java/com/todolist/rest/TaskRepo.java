package com.todolist.rest;

import com.todolist.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends JpaRepository<Task,Integer> {

}
