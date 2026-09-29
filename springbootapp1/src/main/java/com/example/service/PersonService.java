package com.example.service;

import com.example.model.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    public Person searchById(int id) {
        return personRepository.findById(id).get();
    }

    public Person deleteById(int id) {
        var p = personRepository.findById(id).get();
        personRepository.deleteById(id);
        return p;
    }

    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }
}
