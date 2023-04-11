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

public class StudentMain2 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test1");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
		
		Address address= new Address();

		address.setCity("kolkotta");
		address.setSector("sector2");

		Student student = new Student();
		student.setStudentName("pawan kumar");
		student.setStudentSubject("social science");
		
		address.setStudent(student);
		student.setAddress(address);

		transaction.begin();

		em.persist(student);
		em.persist(address);

		transaction.commit();

		em.close();
		entityManagerFactory.close();
	}
}
