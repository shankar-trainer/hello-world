package org.com.capgemini.pl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.com.capegemini.model.Employee;

public class EmpMain2 {

	public static void main(String[] args) {

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpa2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		CriteriaBuilder builder = em.getCriteriaBuilder();

		CriteriaQuery<Employee> query1 = builder.createQuery(Employee.class);
		Root<Employee> emp = query1.from(Employee.class);
		System.out.println("using select");

		CriteriaQuery<Employee> select = query1.select(emp);
		em.createQuery(select).getResultList().forEach(System.out::println);

		CriteriaQuery<Employee> where = query1.select(emp).where(builder.equal(emp.get("name"), "mohan kumar"));
		System.out.println("using where");
		em.createQuery(where).getResultList().forEach(System.out::println);

		CriteriaQuery<Employee> between = query1.select(emp).where(builder.between(emp.get("salary"), 30000, 50000));
		System.out.println("using between ");
		em.createQuery(between).getResultList().forEach(System.out::println);


		CriteriaQuery<Employee> like = query1.select(emp).where(builder.like(emp.get("name"), "m%"));
		System.out.println("using like");
		em.createQuery(like).getResultList().forEach(System.out::println);


		
		
		
		ef.close();
	}
}
