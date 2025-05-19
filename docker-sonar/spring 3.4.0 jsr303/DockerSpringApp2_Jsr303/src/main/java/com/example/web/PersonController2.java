package com.example.web;

import com.example.entity.Person;
import com.example.exception.PersonException;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@CrossOrigin(value = "http://localhost:4200")
public class PersonController2 {

    @Autowired
    PersonService service;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPerson() {
        try {
            return new ResponseEntity<>(service.getAllPerson(), HttpStatus.CREATED);
        } catch (PersonException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> addPerson(@RequestBody Person person) {
        try {
          System.out.println("add "+person);
            return new ResponseEntity<>(service.addPerson(person), HttpStatus.CREATED);
        } catch (PersonException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> searchById(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(service.searchById(id), HttpStatus.CREATED);
        } catch (PersonException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    // localhost:8080/person/search1?id=77687
    // localhost:8080/person/delete?id=77687

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(service.deleteById2(id), HttpStatus.CREATED);
        } catch (PersonException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Person p) {
        try {
            return new ResponseEntity<>(service.update(p), HttpStatus.CREATED);
        } catch (PersonException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
