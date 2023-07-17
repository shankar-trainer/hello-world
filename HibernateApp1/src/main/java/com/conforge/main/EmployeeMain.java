package com.conforge.main;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.conforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();// read the hibernate.cfg.xml

		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();// wrapped form of sql Connection

		Transaction transaction = session.getTransaction();

		Employee employee1 = new Employee();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Add id name and salary ");
		System.out.println("Add name  ");

		// employee1.setEmployeeId(sc.nextInt());
		// sc.nextLine();

		employee1.setEmployeeName(sc.nextLine());
		//employee1.setEmployeeSalary(sc.nextFloat());
		employee1.setDob(new Date((1995-1900), 12, 11));

		transaction.begin();

		session.save(employee1);

		transaction.commit();
		System.out.println("Record added");

		Query<Employee> qr = session.createQuery("from Employee");// hql hibernate query language
		List<Employee> list = qr.list();

		list.forEach(
				p -> System.out.println(p.getEmployeeId() + "\t" + p.getEmployeeName() + "\t" + p.getEmployeeSalary()+"\t"+p.getDob()));

	}
}
