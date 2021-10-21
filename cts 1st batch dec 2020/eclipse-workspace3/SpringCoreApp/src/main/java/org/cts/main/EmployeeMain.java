package org.cts.main;

import org.cts.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		// BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp = (Employee) beanFactory.getBean("emp1");

		Employee emp1 = (Employee) beanFactory.getBean("emp1");

		emp1.setId(12999);
		emp1.setName("virendra kumar");
		emp1.setSalary(10000);

		System.out.println(emp);
		System.out.println(emp1);

		Employee employee = (Employee) beanFactory.getBean("myemp1");
		System.out.println(employee);

	}
}
