package org.capg.web;

import java.util.List;

import org.capg.exception.PersonException;
import org.capg.model.Person;
import org.capg.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController2 {

	@Autowired
	PersonService service;

	@ExceptionHandler(value = PersonException.class)
	@GetMapping("/getAll")
	public ResponseEntity<List<Person>> getAllPerson() {
		try {
			if (service.getAllPerson().size() == 0) {
				throw new PersonException("no record present");
			} else
				return new ResponseEntity<List<Person>>(service.getAllPerson(), HttpStatus.OK);
		} catch (PersonException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@ExceptionHandler(value = PersonException.class)
	@GetMapping("/search/{id}")
	public ResponseEntity<Person> seachPerson(@PathVariable("id") int id) {
		try {
			if (service.searchPerson(id) == null) {
				throw new PersonException("record not found ");
			} else
				return new ResponseEntity<Person>(service.searchPerson(id), HttpStatus.OK);
		} catch (PersonException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Person> removePerson(@PathVariable("id") int id) {
		if (service.searchPerson(id) == null) {
			return new ResponseEntity(null, HttpStatus.NOT_FOUND);
		} else {
			Person p22 = service.searchPerson(id);
			service.deletePerson(id);
			return new ResponseEntity<Person>(p22, HttpStatus.OK);
		}
	}

	@PostMapping(value = "/savePerson")
	public ResponseEntity<Person> savePerson(@RequestBody Person p) {
		if (service.searchPerson(p.getId()) == null) {
			return new ResponseEntity(null, HttpStatus.NOT_FOUND);
		} else {
			service.addPerson(p);
			return new ResponseEntity<Person>(p, HttpStatus.OK);
		}
	}

}
