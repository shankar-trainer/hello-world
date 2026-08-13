package com.cts.service;

import com.cts.dao.PersonRepository;
import com.cts.exception.PersonException;
import com.cts.model.Person;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
//@ComponentScan("com.cts.dao")
public class PersonService {

//    Logger log = LoggerFactory.getLogger("Person.class");

    @Autowired
    private PersonRepository repository;

    public Person addPerson(Person person) {
        log.info("person added " + person);
        return repository.save(person);
    }

    public Person searchPerson(int id) {
        Optional<Person> byId = repository.findById(id);
        if (byId.isPresent()) {
            log.info("found by id " + id + " is " + byId.get());
            return byId.get();
        } else {
            log.error(id + " id not found ");
            throw new PersonException("id not found");
        }
    }

    public Person deletePersonById(int id) {
        Optional<Person> byId = repository.findById(id);
        Person p = null;
        if (byId.isPresent()) {
            p = byId.get();
            repository.delete(byId.get());
            log.info(id + "   found  and deleted " + p);
        }
        {
            log.error(id + " id not found ");
            throw new PersonException("id not found");
        }
    }

    public Person updatePersonById(Person p) {
        Optional<Person> byId = repository.findById(p.getPersonId());
        if (byId.isPresent()) {
            log.info("update operation starts ");
            repository.save(p);
            log.info("update done " + p);
            return p;
        } else {
            log.error(p.getPersonId() + " id not found ");
            throw new PersonException("id not found");
        }
    }

    public List<Person> getAllPerson() {
        if (repository.findAll().size() == 0) {
            log.error("list is empty");
            throw new PersonException("list is empty");
        } else {
            log.info("all data " + repository.findAll());
            return repository.findAll();
        }
    }
}
