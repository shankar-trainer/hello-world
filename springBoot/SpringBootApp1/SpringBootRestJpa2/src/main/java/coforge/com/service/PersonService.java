package coforge.com.service;

import coforge.com.exception.PersonException;
import coforge.com.model.Person;
import coforge.com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Person addPerson(Person p) throws PersonException {
        if (repository.findById(p.getPersonId()).isEmpty())
            return repository.save(p);
        else
            throw new PersonException("id already present");
    }

    public List<Person> getAllPerson() throws PersonException {
        if (repository.findAll().isEmpty())
            throw new PersonException("no record present");
        else
            return repository.findAll();
    }

    public Person searchById(long id) throws PersonException {
        if (repository.findById(id).isEmpty())
            throw new PersonException("no record present with this id " + id);
        else
            return repository.findById(id).get();
    }

    public List<Person> searchByName(String name) throws PersonException {
        if (repository.findBypersonName(name).isEmpty())
            throw new PersonException("no record present");
        else
            return repository.findBypersonName(name);
    }

    public Person deleteById(long id) throws PersonException {
        Person p1 = repository.findById(id).get();

        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return p1;
        } else
            throw new PersonException("no record present with id " + id);
    }

    public Person updatePerson(Person p) throws PersonException {
        if (repository.findById(p.getPersonId()).isPresent()) {
            return repository.save(p);
        }
        else
            throw new PersonException("no record present with id "+p.getPersonId());
    }


}
