package com.cts.dao;

import com.cts.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface  PersonRepository extends JpaRepository<Person,Integer> {


}
