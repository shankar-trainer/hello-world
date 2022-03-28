package com.capg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sample");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		Employee emp1=new Employee();
		
		emp1.setId(10001);
		emp1.setName("hari harana kumar");
		emp1.setSalary(35000);
		
		transaction.begin();
		em.persist(emp1);
		transaction.commit();
		System.out.println("Record added ");
		
	}
}
