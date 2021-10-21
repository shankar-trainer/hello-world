package org.cts.main;


import org.cts.model.Employee;
import org.cts.model.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManagerMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("application1.xml");

		Employee emp1 = beanFactory.getBean("emp", Employee.class);

		Manager manager = beanFactory.getBean("manager", Manager.class);

		System.out.println(emp1);
		System.out.println("------------------------");
		System.out.println(manager);

	}
}
