/*
package org.capg.web;

import java.util.List;

import org.capg.model.Person;
import org.capg.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService service;

	//@RequestMapping("/getAll")
	@GetMapping("/getAll")
	public List<Person> getAllPerson() {
		return service.getAllPerson();
	}

	//@RequestMapping("/search/{id}")
	@GetMapping("/search/{id}")
	public Person seachPerson(@PathVariable("id") int id) {
		return service.searchPerson(id);
	}

	//@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@DeleteMapping(value = "/delete/{id}")
	public Person removePerson(@PathVariable("id") int id) {
		return service.deletePerson(id);
	}

	//@RequestMapping(value = "/savePerson", method = RequestMethod.POST)
	@PostMapping(value = "/savePerson")
	public Person savePerson(@RequestBody Person p) {
		return service.addPerson(p);
	}

}
*/