package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.bean.Person;

public class PersonDao {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tr;
	Person p;

	public PersonDao() {
		emf = Persistence.createEntityManagerFactory("sample");
		em = emf.createEntityManager();
		tr = em.getTransaction();
	}
 //C  -- create
	public Person addPerson(Person person) {
		if (em.find(Person.class, person.getPersonId()) == null) {
			tr.begin();
			em.persist(person);
			tr.commit();
			return person;
		} else
			return null;
	}
	//R retrieve 
	public List<Person> getAllPerson(){
        return em.createQuery("from Person").getResultList();		
	}
	
	//R retrieve 
	public Person searchPerson(Person person){
		p=null;
		p=em.find(Person.class, person.getPersonId()); 
		return p;	
	}
	//D   -- delete
	public Person deletePerson(Person person) {
		Person removePerson=em.find(Person.class, person.getPersonId());
		if (removePerson != null) {
			tr.begin();
			em.remove(removePerson);
			tr.commit();
			return person;
		} else
			return null;
	}
	// U -- update
	public Person updatePerson(Person person) {
		if (em.find(Person.class, person.getPersonId()) != null) {
			tr.begin();
			em.merge(person);
			tr.commit();
			return person;
		} else
			return null;
	}
	

}
