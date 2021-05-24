package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.PersonRepo;
import com.cts.model.Person;

@RestController
@RequestMapping("/payment")
public class PersonController {


	@Autowired
	PersonRepo repo;
	
	@PostMapping("/addperson")
	public Person addCard(@RequestBody  Person person ) {
		return 	repo.save(person);
	}
	
	@GetMapping("/showperson")
	public List<Person> showPerson() {
		return 	repo.findAll();
	}
	
}
