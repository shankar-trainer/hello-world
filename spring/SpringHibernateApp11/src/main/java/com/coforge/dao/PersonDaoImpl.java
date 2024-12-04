package com.coforge.dao;

import com.coforge.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class  PersonDaoImpl implements  PersonDao {

    @Autowired
    private SessionFactory sessionFactory;
    private Transaction transaction;

    private Session session;

    public PersonDaoImpl() {
        this.sessionFactory = sessionFactory;
        this.session= sessionFactory.openSession();
        this.transaction= session.getTransaction();
    }

    @Override
    public Person addPerson(Person p) {
        transaction.begin();
        session.save(p);
        transaction.commit();
        return  p;
    }

    @Override
    public Person updatePerson(Person p) {
        return null;
    }

    @Override
    public Person searchPerson(int id) {
        return null;
    }

    @Override
    public Person deletePerson(int id) {
        return null;
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }
}
