package com.nec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nec.dao.PersonRepository;
import com.nec.exception.PersonException;
import com.nec.model.Person;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public Person addPerson(Person person) throws PersonException {
		if (searchPerson(person.getId())==null)
		return personRepository.save(person);
		else
			throw new PersonException("id already present");
	}
	public Person updatePerson(Person person) throws PersonException {
		if (searchPerson(person.getId())!=null)
			return personRepository.save(person);
		else
			throw new PersonException("id not  present");
	}

	public Person searchPerson(int id) throws PersonException {
		Optional<Person> findById = personRepository.findById(id);
		if (findById.isPresent())
			return findById.get();
		else 
			throw new PersonException("id not found  ");
	}

	public List<Person> getAllPerson() throws PersonException {
		if(personRepository.findAll().size()==0)
			throw new PersonException("no record present ");
		else
		return personRepository.findAll();
	}

}
