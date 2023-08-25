package com.todolist.rest;

import com.todolist.entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrganisationRepo extends JpaRepository<Organisation,Integer> {


}
