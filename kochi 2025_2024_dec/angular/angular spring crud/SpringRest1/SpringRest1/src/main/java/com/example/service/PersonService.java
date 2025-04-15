package com.example.service;

import com.example.entity.Person;
import com.example.exception.PersonException;
import com.example.repository.PersonRepository;
import jakarta.persistence.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public List<Person> getAllPerson() {
        if (repository.findAll().size() == 0)
            throw new PersonException("person list is empty");
        else
            return repository.findAll();
    }

    public Person addPerson(Person person) {
        if (repository.findById(person.getId()).isPresent())
            throw new PersonException("person already present with given id ");
        else
            return repository.save(person);
    }

    public Person searchById(int id) {
        if (repository.findById(id).isEmpty())
            throw new PersonException("person not  present with given id ");
        else
            return repository.findById(id).get();
    }

    public Person deleteById2(int id) {

        if (repository.findById(id).isEmpty())
            throw new PersonException("person not  present with given id ");
        else {
            Person person = repository.findById(id).get();
            Person p2 = person;
            repository.delete(person);
            return p2;
        }
    }

    public Person update(Person p) {
        if (repository.findById(p.getId()).isEmpty())
            throw new PersonException("person not  present  ");
        else {
            return repository.save(p);
        }
    }
}