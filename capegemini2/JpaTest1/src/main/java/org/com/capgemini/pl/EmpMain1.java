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

import org.com.capegemini.model.Employee;

public class EmpMain1 {

	public static void main(String[] args) {

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpa2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Scanner scanner = new Scanner(System.in);

		Employee emp1 = new Employee();
/*
		System.out.println("Enter name");
		emp1.setName(scanner.nextLine());

		System.out.println("Enter Salary");
		emp1.setSalary(scanner.nextFloat());

		System.out.println("Enter dob in dd-MM-yyyy format");
		String s = scanner.next();
		Date dob = null;
		try {
			dob = sdf.parse(s);
		} catch (ParseException e2) {
			System.out.println("date not in format dd-MM-yyyy");
		}

		emp1.setDob(dob);
		tr.begin();
		em.persist(emp1);
		tr.commit();
		*/
		System.out.println("Record added ");

		Query qr = em.createQuery("from Employee");

		List<Employee> list = qr.getResultList();

		for (Employee e : list)
			System.out.println(e);

		Employee e1 = (Employee) em.createQuery("from Employee where id=2").getSingleResult();
		if (e1 != null)
			System.out.println(e1);

		System.out.println("typed query ");
		TypedQuery<Employee> query1 = em.createQuery("select e from Employee e", Employee.class);
		List<Employee> resultList = query1.getResultList();

		resultList.stream().forEach(a -> System.out.println(a));

		Query q2 = em.createQuery("select count(e.id) from Employee e");
		
		Object o =  q2.getSingleResult();
		System.out.println("no of rows "+o);

		System.out.println("typed query  with parameter");
		TypedQuery<Employee> query2 = em.createQuery("from Employee where id=:myid", Employee.class);
		query2.setParameter("myid", 2);
		List<Employee> resultList1 = query2.getResultList();

		System.out.println(resultList1);

		System.out.println("\ncalling named query.............\n");

		Query createNamedQuery = em.createNamedQuery("getAllEmp");
		createNamedQuery.getResultList().stream().forEach(System.out::println);

		ef.close();
	}
}
