package com.example.service;

import com.example.dao.PersonRepository;
import com.example.model.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.exception.PersonException;
@Service
@Data
public class PersonService {

    @Autowired
    PersonRepository repository;
    public Person removePerson(int id) throws PersonException {
        Optional<Person> byId = repository.findById(id);
        if (!byId.isPresent())
            throw new PersonException("id not  present");
        else if (byId.isPresent()) {
            Person person = byId.get();
            repository.delete(person);
            return person;
        }
        return  null;
    }


    public Person addPerson(Person person) throws PersonException {
        Optional<Person> byId = repository.findById(person.getPersonId());
        if(byId.isPresent())
            throw new PersonException("id already present");
        else
            return repository.save(person);
    }

    public Person searchPerson(int id) throws PersonException {
        Optional<Person> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new PersonException("id not present");
    }

    public List<Person> getAllPerson() throws PersonException {
        List<Person> all = repository.findAll();
        if(all.size()==0)
            throw new PersonException("list is empty");
        else
            return  all;

    }

}
