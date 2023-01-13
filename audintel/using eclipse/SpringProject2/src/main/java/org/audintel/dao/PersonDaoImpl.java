package org.audintel.dao;

import java.util.HashSet;
import java.util.Set;

import org.audintel.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao {
	Set<Person> personSet;

	public PersonDaoImpl() {
		personSet = new HashSet<>();
	}

	@Override
	public Person addPerson(Person person) {
		if (searchPerson(person.getPersonId()) == null) {
			personSet.add(person);
			return person;
		}
		return null;
	}

	@Override
	public Person searchPerson(long id) {
		for (Person p : personSet) {
			if (p.getPersonId() == id)
				return p;
		}
		return null;
	}

	@Override
	public Person deletePerson(long id) {
		Person p = searchPerson(id);
		if (searchPerson(id) != null) {
			personSet.remove(searchPerson(id));
			return p;
		}
		return null;
	}

	@Override
	public Person updatePerson(Person person) {
		Person p = searchPerson(person.getPersonId());
		if (searchPerson(person.getPersonId()) != null) {
			personSet.remove(p);
			personSet.add(person);
			return person;
		}
		return null;
	}

	@Override
	public Set<Person> getAllPerson() {
		return personSet;
	}

}
