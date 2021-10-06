package org.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee employee = (Employee) beanFactory.getBean("emp1");

		System.out.println("id is " + employee.getId());
		System.out.println("name is " + employee.getName());

		Address address = employee.getAddress();
		System.out.println("\nAddress is ");
		System.out.println("\t Location is "+address.getLocation());
		System.out.println("\t City is "+address.getCity());
		System.out.println("\t Country is "+address.getCountry());

	}
}
