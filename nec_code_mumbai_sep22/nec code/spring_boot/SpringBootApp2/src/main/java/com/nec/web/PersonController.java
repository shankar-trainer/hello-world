package com.nec.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nec.exception.PersonException;
import com.nec.model.Person;
import com.nec.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;
	
	//@RequestMapping("/add")
	@PostMapping("/add")
	public ResponseEntity<Person> addPerson(@RequestBody   Person person) {
		
		try {
			return   new ResponseEntity(service.addPerson(person),HttpStatus.OK);
		} catch (PersonException e) {
			return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/add")
	public ResponseEntity<Person> updatePerson(@RequestBody   Person person) {
		
		try {
			return   new ResponseEntity(service.updatePerson(person),HttpStatus.OK);
		} catch (PersonException e) {
			return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Person> searchPerson(@PathVariable  int id) {
		
		try {
			return   new ResponseEntity(service.searchPerson(id),HttpStatus.OK);
		} catch (PersonException e) {
			return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Person>> getAllPerson() {
		try {
			return   new ResponseEntity(service.getAllPerson(),HttpStatus.OK);
		} catch (PersonException e) {
			return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
}
