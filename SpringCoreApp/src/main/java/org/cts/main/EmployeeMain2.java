package org.cts.main;

import org.cts.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeMain2 {

	public static void main(String[] args) {

		// BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		// ApplicationContext beanFactory = new
		// ClassPathXmlApplicationContext("beans.xml");

//		ApplicationContext beanFactory =new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		ConfigurableApplicationContext beanFactory = new FileSystemXmlApplicationContext(
				"src/main/resources/beans.xml");

		Employee emp = (Employee) beanFactory.getBean("emp1");
		System.out.println(emp);

		beanFactory.close();

	}
}
