package com.cts.web;

import com.cts.model.Person;
import com.cts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    PersonService service;

    @RequestMapping("/person")
    public List<Person> getAllPerson() {
        return service.getAllPerson();
    }

}
