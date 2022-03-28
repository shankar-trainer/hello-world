package com.capg.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.bean.Customer;
import com.capg.bean.Employee;

public class CustomerMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sample");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  name and dob(dd-MM-yyyy format)");
       
		Customer customer=new Customer();
		
		customer.setName(sc.nextLine());
		String s=sc.next();

		
		 DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 //dateTimeFormatter.
		 
		 LocalDate date1 = LocalDate.parse(s, dateTimeFormatter);
		
          customer.setDob(date1);		
          
          transaction.begin();
          em.persist(customer);
          transaction.commit();
          System.out.println("Record added ");
          

  	    Query qr = em.createQuery("from Customer");	
		
  	    List<Customer> resultList = qr.getResultList();
  	    
  	    for(Customer c:resultList)
  	    	System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getDob());
  	    
  	    System.out.println("using java 8");
  	    resultList.stream().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getDob()));   
  		em.close();
  		emf.close();
  		sc.close();

          
		

	}
}
