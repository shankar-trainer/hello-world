package com.example.web;

import com.example.dto.PersonDto;
import com.example.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class PersonController {
    @Autowired
    private PersonService personService;

//    @Autowired
//    public PersonController(PersonService personService) {
//        this.personService = personService;
//    }

    @GetMapping("/hello")
    public String hello(){
        return  "hello world";
    }

    @GetMapping("/person")
    public List<PersonDto> getAllPersons() {
        return personService.getAllPerson();
    }

    @PostMapping("/person")
    public PersonDto addPerson(
            @RequestBody PersonDto dto) {
        log.debug("before add person", dto);

        return personService.addPerson(dto);
    }
}
