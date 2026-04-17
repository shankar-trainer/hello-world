package com.main;

import com.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();

		// Create/Persist
		em.getTransaction().begin();
		Student s = new Student();
		s.setName("John Doe");
		em.persist(s);
		em.getTransaction().commit();

		// Read/Find
		Student foundStudent = em.find(Student.class, 1L);
        System.out.println(foundStudent);
		em.close();
		emf.close();

	}
}
