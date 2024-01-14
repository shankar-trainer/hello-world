package com.coforge.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();

		Customer customer = new Customer();

		Scanner scanner = new Scanner(System.in);

//		System.out.println("enter id name and salary ");
		System.out.println("enter name and salary ");

		//customer.setCustomerId(scanner.nextInt());
		//scanner.nextLine();
		customer.setCustomerName(scanner.nextLine());
		customer.setCustomerSalary(scanner.nextFloat());
		
		customer.setCustomerDob(LocalDate.of(1997, 10, 21));

		 
		
		
//		customer.setCustomerId(676776767);
//		customer.setCustomerName("suresh kumar");
//		customer.setCustomerSalary(35000.00f);

		transaction.begin();
		session.save(customer);

		System.out.println("save data into database");
		if (scanner.next().equals("yes"))
			transaction.commit();
		else
			transaction.rollback();

		System.out.println("all employee records ");
	   
		// hql -- hibernate query language 
		
		 Query<Customer> createQuery = session.createQuery("from Customer");
	     List<Customer> resultList = createQuery.getResultList();
	     
	     for (Customer customer2 : resultList) {
			System.out.println(customer2.getCustomerId()+"\t"+customer2.getCustomerName()+"\t"+customer2.getCustomerSalary());
		}
	    
	     scanner.close();
	     session.close();
	}
}
