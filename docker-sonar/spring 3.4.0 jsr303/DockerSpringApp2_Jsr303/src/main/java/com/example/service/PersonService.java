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
        // if (repository.findById(person.getId()).isPresent())
        //     throw new PersonException("person already present with given id ");
        // else
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

/*
add Person(id=null, name=hari sharma, salary=56000.0, dob=1997-11-20)
2025-05-19T14:55:31.577+05:30 ERROR 10376 --- [SpringRest1] [nio-8080-exec-1] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: org.springframework.dao.InvalidDataAccessApiUsageException: The given id must not be null] with root cause
java.lang.IllegalArgumentException: The given id must not be null
line 26 findById()
at line 28             return repository.save(person);
   id is generated


Facing with ObjectOptimisticLocking FailureException after migrating to Hibernate 6.6.2.Final
https://discourse.hibernate.org/t/facing-with-objectoptimisticlocking-failureexception-after-migrating-to-hibernate-6-6-2-final/10725
After migration to spring-boot 3.4.0 and hibernate 6.6.2.Final we faced with error

org.springframework.orm.ObjectOptimisticLockingFailureException: Row was updated or deleted by another transaction (or unsaved-value mapping was incorrect):[SolvencyEntity#186500]
I have two entities with one-to-one relationship. 


*/