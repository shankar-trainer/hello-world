package org.com.model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		/*
		 * Scanner scanner = new Scanner(System.in); Employee employee = new
		 * Employee();
		 * 
		 * System.out.println("Enter id "); employee.setId(scanner.nextInt());
		 * 
		 * System.out.println("Enter name "); scanner.nextLine();
		 * employee.setName(scanner.nextLine());
		 * 
		 * System.out.println("Enter salary ");
		 * employee.setSalary(scanner.nextFloat());
		 * 
		 * Transaction tr = session.beginTransaction();
		 * 
		 * tr.begin(); session.save(employee);
		 * 
		 * System.out.println("Save data y\\n"); if
		 * (scanner.next().equalsIgnoreCase("y")) tr.commit(); else
		 * tr.rollback();
		 * 
		 * System.out.println("Record added");
		 */

		// Query query = session.createQuery("from Employee");

		Query query = session.getNamedQuery("showall");

		List<Employee> list1 = query.list();

		for (Employee employee1 : list1) {
			System.out.println(employee1.getId() + "  " + employee1.getName() + "  " + employee1.getSalary());
		}
	}
}
