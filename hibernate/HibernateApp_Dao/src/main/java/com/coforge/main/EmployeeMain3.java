package com.coforge.main;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

public class EmployeeMain3 {

	public static void main(String[] args) {

		SessionFactory factory = MySessionFactory.getSessionFactory();

		Session session = factory.openSession();
	 

		Query namedQuery = session.createNamedQuery("allemp");

		System.out.println("named query ");
		namedQuery.getResultList().forEach(p -> System.out.println(p));
		
		Query namedQuery1 = session.createNamedQuery("empbyid");

		namedQuery1.setParameter(1, 8);
		System.out.println("named query 2");
		namedQuery1.getResultList().forEach(p -> System.out.println(p));


		session.close();

	}
}
