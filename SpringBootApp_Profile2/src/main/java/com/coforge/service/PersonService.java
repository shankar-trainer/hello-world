package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.PersonDao;
import com.coforge.entity.Person;
import com.coforge.exception.PersonException;

@Service
public class PersonService {

	@Autowired
	PersonDao dao;

	public Person addPerson(Person p) throws PersonException {
		Optional<Person> findById = dao.findById(p.getId());
		
		if(findById.isPresent())
			throw new PersonException("person already present");
		else
			return dao.save(p);
	}
	
	public List<Person> getAllPerson() throws PersonException {
		if (dao.findAll().size()==0)
			throw new PersonException("person list is empty");
		else
			return dao.findAll();
	}

}
