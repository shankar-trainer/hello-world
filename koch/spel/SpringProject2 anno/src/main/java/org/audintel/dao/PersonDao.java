package org.audintel.dao;

import java.util.Set;

import org.audintel.model.Person;

public interface PersonDao {

	public Person addPerson(Person person);
	public Person searchPerson(long id);
	public Person deletePerson(long id);
	public Person updatePerson(Person person);
	public Set<Person> getAllPerson();
}
