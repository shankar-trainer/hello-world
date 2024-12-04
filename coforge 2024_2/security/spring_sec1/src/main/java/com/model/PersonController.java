package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepo personRepo;

    @GetMapping("/all")
    public List<Person> personList(){
        return  personRepo.findAll();
    }

    @PostMapping("/new")
    public Person addPerson(@RequestBody Person person){
       return personRepo.save(person);
    }

}