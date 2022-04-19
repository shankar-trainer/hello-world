package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Employee;

public class EmployeeMain_PSchema {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = (Employee) beanFactory.getBean("emp9");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getPf());
		System.out.println(e.getSalary());

	}
}
