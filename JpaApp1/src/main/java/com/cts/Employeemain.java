package com.cts;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cts.model.Employee;

public class Employeemain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test1");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction tr = entityManager.getTransaction();

		Scanner sc = new Scanner(System.in);

		//System.out.println("Enter id name and salary of employee");
		System.out.println("Enter  name and salary of employee");

		Employee employee = new Employee();
		/*
		 * employee.setEmpId(sc.nextInt());
		 * 
		 * sc.nextLine();
		 */
		employee.setEmpName(sc.nextLine());
		employee.setSalary(sc.nextFloat());

		tr.begin();
		entityManager.persist(employee);

		tr.commit();
		

		System.out.println("Record added");
		
		Query createQuery = entityManager.createQuery("from Employee");
		
		List<Employee> resultList = createQuery.getResultList();
	
		//resultList.parallelStream().forEach();
	for(Employee s:resultList)
		 System.out.println(s.getEmpId()+" "+s.getEmpName()+"  "+s.getSalary());
		
		
		
		entityManager.close();
		entityManagerFactory.close();

	}
}
