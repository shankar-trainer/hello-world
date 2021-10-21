package org.com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpa2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		Student student=new Student();
		
		student.setName("mohan kumar");
		student.setSubject("Math");
	
		Address address=new Address();
		
		address.setStreet("sector1");
		address.setCity("noida");
		address.setState("UP");
		address.setPin(78878787);
		
		student.setAddress(address);
		
		tr.begin();
		em.persist(student);
		em.persist(address);

		tr.commit();
		System.out.println("Student record added");
		
		em.createQuery("select s from Student s").getResultList().forEach(System.out::println);
		ef.close();
	}
}
