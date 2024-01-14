package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		Employee employee=new Employee();
		employee.setId(10002);
		employee.setName("narayn tiwari ");;
		employee.setSalary(25000.00f);
		
		
		transaction.begin();
		 session.save(employee);
		transaction.commit();
		System.out.println("Record added");
		
	}
}
