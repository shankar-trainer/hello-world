package org.com.capgemini.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.com.capegemini.model.Employee;

public class CriteriaPrg1 {

	public static void main(String[] args) {
		
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpa2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Employee> query1=cb.createQuery(Employee.class);
		Root<Employee> emp=query1.from(Employee.class);
		CriteriaQuery<Employee> select = query1.select(emp);
		
	    em.createQuery(select).getResultList().forEach(System.out::println);
		
	   
	    
	}
}
