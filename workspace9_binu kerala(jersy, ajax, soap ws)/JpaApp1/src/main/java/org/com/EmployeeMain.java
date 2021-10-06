package org.com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.com.model.Customer;

public class EmployeeMain {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa1");

		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
		Customer customer = new Customer();

		customer.setId(10004);
		customer.setName("deepak kumar");
		customer.setSalary(90000);

		transaction.begin();
		em.persist(customer);
		transaction.commit();
		
		System.out.println("Record added");

		Query createQuery = em.createQuery("from Customer");
		
		List<Customer> resultList = createQuery.getResultList();
		
		for(Customer c:resultList)
			System.out.println(c);
		
		transaction.begin();
		em.remove(customer);
		transaction.commit();
		
		
		
		System.out.println("---------------------------------------java 8 -------------------");
		
		resultList.stream().forEach(System.out::println);
				
		em.close();
	

	}
}
