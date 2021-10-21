package org.com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneMain {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("prdonetoone");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		Employee emp1=new Employee();
		emp1.setId(1234);
		emp1.setName("ram kumar");
		emp1.setSalary(12000);
		
		Manager manager=new Manager();
		manager.setId(1009);
		manager.setName("suresh kumar");
		manager.setSalary(40000);
		manager.setDepartment("loan");

		tr.begin();
		em.persist(emp1);
		em.persist(manager);
		tr.commit();
	
		ef.close();
	}
}
