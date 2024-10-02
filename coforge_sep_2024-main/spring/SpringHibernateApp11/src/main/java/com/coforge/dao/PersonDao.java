package com.coforge.dao;

import com.coforge.model.Person;

import java.util.List;

public interface PersonDao {

    public Person addPerson(Person p);
    public Person updatePerson(Person p);
    public Person searchPerson(int id);
    public Person deletePerson(int id);
    public List<Person> getAllPerson();
}
