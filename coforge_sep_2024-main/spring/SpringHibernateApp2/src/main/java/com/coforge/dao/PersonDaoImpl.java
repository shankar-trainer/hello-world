package com.coforge.dao;

import com.coforge.exception.PersonException;
import com.coforge.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory;
    private Session session;

    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.session = sessionFactory.openSession();
       }

    @Transactional
    @Override
    public Person addPerson(Person p) throws PersonException {
        Session session1=sessionFactory.getCurrentSession();
        if (session1.find(Person.class, p.getId()) == null) {
            session1.save(p);
            return p;
        } else throw new PersonException("person id already present");
    }

    @Transactional//(value = Transactional.TxType.REQUIRED, rollbackOn={})
    @Override
    public Person updatePerson(Person p) throws PersonException {
        Session session1=sessionFactory.getCurrentSession();
        if (session1.find(Person.class, p.getId()) == null)
            throw new PersonException("person id not present");
        else {
            session1.merge(p);
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

    @Transactional
    @Override
    public Person deletePerson(int id) throws PersonException {
        Session session1=sessionFactory.getCurrentSession();
        Person person = session1.find(Person.class, id);
        if (person == null)
            throw new PersonException("person id not present");
        else {
            session1.delete(person);
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
