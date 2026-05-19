package org.montran.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.montran.model.Person;
import org.montran.util.SessionFactoryUtil;

public class PersonDao {

	private SessionFactory sf;
	private Session session;
	private Query createQuery;
	private List<Person> resultList;
	private Transaction transaction;

	public PersonDao() {
		sf = SessionFactoryUtil.mySessionFactory();
		session = sf.openSession();
		transaction = session.getTransaction();
	}

	public List<Person> getAllPerson() {
		createQuery = session.createQuery("from Person");
		resultList = createQuery.getResultList();
		return resultList;
	}

	public Person searchPerson(Person person) {
		return session.get(Person.class, person.getId());
	}

	public boolean addPerson(Person person) {
		if (searchPerson(person) == null) {
			
			transaction.begin();
			session.save(person);
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean removePerson(Person person) {
		Person searchPerson = searchPerson(person);
		if (searchPerson!= null) {
			transaction.begin();
			session.delete(searchPerson);
			transaction.commit();
			return true;
		}
		return false;
	}
	
	public boolean updatePerson(Person person) {
		Person searchPerson = searchPerson(person);
		
		if (searchPerson!=null) {
			session=null;
			session=sf.openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.update(person);
			transaction.commit();
			return true;
		}
		return false;
	}

}
