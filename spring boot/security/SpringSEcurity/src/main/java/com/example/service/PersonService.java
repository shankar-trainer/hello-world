package com.example.service;

import com.example.dto.PersonDto;
import com.example.mapper.PersonMapper;
import com.example.model.Person;
import com.example.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PersonService {

    private PersonRepository personRepository;
    private PersonMapper personMapper;

    @Autowired
    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public PersonDto addPerson(PersonDto personDto) {
        Person person = personMapper.personDtoToPerson(personDto);
        log.debug("before save", person);
        Person p1 = personRepository.save(person);
        log.debug("after save save", person);

        return personMapper.personToPersonDTo(p1);
    }

    public List<PersonDto> getAllPerson() {
        List<Person> all = personRepository.findAll();
        List<PersonDto> personDtoList = new ArrayList<>();
        for (Person p : all) {
            personDtoList.add(personMapper.personToPersonDTo(p));
        }
        return personDtoList;
    }
}
