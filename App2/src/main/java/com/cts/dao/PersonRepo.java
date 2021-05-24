package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cts.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{
	
	

}
