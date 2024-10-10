package com.coforge.web;

import com.coforge.model.Person;
import com.coforge.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("/person")
    public List<Person> getAllPersonList(){
        return  repository.findAll();
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody  Person person){

        return  repository.save(person);
    }

}
