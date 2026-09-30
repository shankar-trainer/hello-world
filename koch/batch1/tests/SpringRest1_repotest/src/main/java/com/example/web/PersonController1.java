package com.example.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Person;
import com.example.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController1 {

	@Autowired
	PersonRepository repository;

	@GetMapping("/all")
	public List<Person> getAllPerson() {
		return repository.findAll();
	}

	@PostMapping("/add")
	public ResponseEntity<?> addPerson(@RequestBody Person person) {

		Optional<Person> byId = repository.findById(person.getId());
		if (byId.isEmpty()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(person));
		} else
			return ResponseEntity.status(HttpStatus.FOUND).body("id already present");

	}

	@GetMapping("/search/{id}")
	public ResponseEntity<?> searchById(@PathVariable("id") int id) {
		Optional<Person> byId = repository.findById(id);
		if (byId.isPresent())
			return ResponseEntity.status(HttpStatus.FOUND).body(byId.get());
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not found");
	}

	// localhost:8080/person/search1?id=77687

	@GetMapping("/search1")
	public ResponseEntity<?> seachrById1(@RequestParam("id") int id) {
		Optional<Person> byId = repository.findById(id);
		if (byId.isPresent())
			return ResponseEntity.status(HttpStatus.FOUND).body(byId.get());
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not found");
	}

	// localhost:8080/person/delete?id=77687

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteById1(@RequestParam("id") int id) {
		Person p = null;

		Optional<Person> byId = repository.findById(id);
		if (byId.isPresent()) {
			p = byId.get();
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.FOUND).body(p);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not present");
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteById2(@PathVariable("id") int id) {
		Person p = null;

		Optional<Person> byId = repository.findById(id);
		if (byId.isPresent()) {
			p = byId.get();
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.FOUND).body(p);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not present");
		}
	}

	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Person p) {

		Optional<Person> byId = repository.findById(p.getId());
		if (byId.isPresent()) {
			return ResponseEntity.status(HttpStatus.FOUND).body(repository.save(p));
		} else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not found");

	}

}
