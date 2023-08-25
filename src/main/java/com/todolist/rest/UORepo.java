package com.todolist.rest;

import com.todolist.entities.UserOrganisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UORepo extends JpaRepository<UserOrganisation,Integer> {


}
