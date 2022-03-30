package com.capg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.bean.Employee;

public class EmployeeMain_NamedQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sample");
		EntityManager em=emf.createEntityManager();
		
		Query createNamedQuery = em.createNamedQuery("getallemp");
		createNamedQuery.getResultList().forEach(System.out::println);
		
		System.out.println("---------");
		em.createNamedQuery("query1").getResultList().forEach(System.out::println);
		
	}
}
