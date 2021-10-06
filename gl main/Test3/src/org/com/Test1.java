package org.com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) {
		
	Session session=	new Configuration().configure().buildSessionFactory().openSession();
	
	List<Employee> list1=session.createQuery("from Employee").list();
	
	for (Employee employee : list1) {
		System.out.println(employee.getId()+"  "+employee.getName());
	}
	
	}
}
