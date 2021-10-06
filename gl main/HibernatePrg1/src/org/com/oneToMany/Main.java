package org.com.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.com.HibernateUtil;
import org.com.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {

		SessionFactory sf1 = HibernateUtil.getSF();
		Session session = sf1.openSession();
		Transaction transaction = session.beginTransaction();

		Department dept = new Department();

		dept.setName("admin");

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee1.setName("a kumar");
		employee2.setName("p kumar");
		employee3.setName("s kumar");

		List<Employee> list1 = new ArrayList<>();

		list1.add(employee1);
		list1.add(employee2);
		list1.add(employee3);

		dept.setEmp_list(list1);
		
		transaction.begin();
		session.save(dept);
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);

		
		
		transaction.commit();
		System.out.println("Department added");
		session.close();
		sf1.close();
	}
}
