package org.audintel.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.audintel.model.Address;
import org.audintel.model.Book;
import org.audintel.model.Student;

public class StudentMain {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test1");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
		
		Address address= new Address();

		address.setCity("hyderabad");
		address.setSector("sector1");

		Student student = new Student();
		student.setStudentName("suman kumar");
		student.setStudentSubject("science");
		student.setAddress(address);

		transaction.begin();

		em.persist(address);
		em.persist(student);

		transaction.commit();

		// =================

		Address address1 = new Address();

		address1.setCity("sikandrabad");
		address1.setSector("sector2");

		Student student1 = new Student();
		student1.setStudentName("aman kumar");
		student1.setStudentSubject("telugu");
		student1.setAddress(address1);

		transaction.begin();

		em.persist(address1);
		em.persist(student1);

		transaction.commit();

		
		for(Student s:  em.createQuery("from Student",Student.class).getResultList()) {
		  System.out.println("student "+s.getStudentRoll()+"\t"+s.getStudentName()+"\t"+s.getStudentSubject());
		  System.out.println("\tcity "+s.getAddress().getAddrId()+"\t"+s.getAddress().getSector()+"\t"+s.getAddress().getCity());
		}
		em.close();
		entityManagerFactory.close();
	}
}
