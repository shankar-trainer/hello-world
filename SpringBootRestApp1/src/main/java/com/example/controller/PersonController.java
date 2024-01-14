package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

	static List<Person> personList;
	static Person person[] = new Person[5];
	static long pid[] = { 787887, 56567, 676678, 67676, 67789 };
	static String pname[] = { "anand kumar", "suresh kumar", "lal babu", "kamal sagar", "ramesh kumar" };
	static float psalary[] = { 34000, 90000, 45000, 39000, 25000 };

	static {
		personList = new ArrayList<>();
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
			person[i].setId(pid[i]);
			person[i].setName(pname[i]);
			person[i].setSalary(psalary[i]);
			personList.add(person[i]);
		}
	}

	@GetMapping("/all")
	public List<Person> getAllPerson() {
		return personList;
	}
	
	@GetMapping("/search/{id}")
	public Person searchPerson(@PathVariable("id") long id) {
		for (Person person2 : personList) {
			if(person2.getId()==id)
				return person2;
		}
		return  null;
	}
	
	@PostMapping("/add")
	public Person addPerson(@RequestBody Person person) {
		     personList.add(person);
		     return person;
	}
	
}
