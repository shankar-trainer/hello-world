package com.coforge.dao;

import com.coforge.exception.PersonException;
import com.coforge.model.Person;

import java.util.List;

public interface PersonDao {

    public Person addPerson(Person p)throws PersonException;
    public Person updatePerson(Person p) throws PersonException;
    public Person searchPerson(int id) throws PersonException;
    public Person deletePerson(int id) throws PersonException;
    public List<Person> getAllPerson() throws PersonException;
}
