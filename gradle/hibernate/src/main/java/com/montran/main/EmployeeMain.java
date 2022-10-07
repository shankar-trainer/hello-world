package com.montran.main;

import java.util.List;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.montran.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Query<Employee> query = session.createQuery("from  Employee", Employee.class);

		List<Employee> list = query.getResultList();

		for (Employee employee : list) {
			System.out.println(employee.getId() + "  " + employee.getName());
		}

	}
}
