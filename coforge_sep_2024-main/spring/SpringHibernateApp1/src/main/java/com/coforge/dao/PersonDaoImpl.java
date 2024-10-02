package com.coforge.dao;

import com.coforge.exception.PersonException;
import com.coforge.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory;
    private Transaction transaction;
    private Session session;

    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.session = sessionFactory.openSession();
        this.transaction = session.getTransaction();
    }

    @Override
    public Person addPerson(Person p) throws PersonException {
        if (session.find(Person.class, p.getId()) == null) {
            transaction.begin();
            session.save(p);
            transaction.commit();
            return p;
        } else throw new PersonException("person id already present");
    }

    @Override
    public Person updatePerson(Person p) throws PersonException {
        if (session.find(Person.class, p.getId()) == null)
            throw new PersonException("person id not present");
        else {
            transaction.begin();
            session.merge(p);
            transaction.commit();
            return p;
        }
    }

    @Override
    public Person searchPerson(int id) throws PersonException {
        if (session.find(Person.class, id) == null)
            throw new PersonException("person id not present");
        else
            return session.find(Person.class, id);
    }

    @Override
    public Person deletePerson(int id) throws PersonException {
        Person person = session.find(Person.class, id);
        if (person == null)
            throw new PersonException("person id not present");
        else {
            transaction.begin();
            session.delete(person);
            transaction.commit();
            return person;
        }
    }

    @Override
    public List<Person> getAllPerson() throws PersonException {
        List<Person> fromPerson = session.createQuery("from Person").list();
        if (fromPerson.size() == 0)
            throw new PersonException("person list is empty");
        else
            return fromPerson;
    }
}
