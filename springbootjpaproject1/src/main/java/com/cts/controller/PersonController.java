package com.cts.controller;

import com.cts.dao.PersonRepository;
import com.cts.dto.PersonDTO;
import com.cts.dto.PersonDTOMapper;
import com.cts.model.Person;
import com.cts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonDTOMapper mapper;

    @PostMapping("/person")
    public PersonDTO addPerson(@RequestBody  PersonDTO p){

        return  personService.addPerson(mapper.dtoToEntity(p));
    }

    @GetMapping("/person")
    public List<PersonDTO> showAllPerson(){
        return  personService.showAllPerson();
    }


    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/person1")
    public List<Person> showAllPerson1(){

        return  personRepository.findAll();

    }

}
