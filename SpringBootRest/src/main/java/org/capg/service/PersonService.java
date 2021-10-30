package org.capg.service;

import java.util.List;
import java.util.Optional;

import org.capg.dao.PersonRepository;
import org.capg.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	public Person addPerson(Person person) {
		return personRepository.save(person);
	}

	public Person searchPerson(int id) {
		Optional<Person> findById = personRepository.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			return null;
	}

	public Person deletePerson(int id) {
		if (personRepository.findById(id).get() != null) {
			Person p3 = personRepository.findById(id).get();
			personRepository.deleteById(id);
			return p3;
		}
		return null;
	}

}
