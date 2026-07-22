package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;
import com.coforge.model.HelloWorld;

public class EmployeeMain {
	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) beanFactory.getBean("emp1");
	
		Employee emp1 = (Employee) beanFactory.getBean("emp1");
		
		emp1.setId(90091);
		emp1.setName("amit kumar");
	
		System.out.println("employee1\nid is " + emp.getId());
		System.out.println("name is " + emp.getName());

		System.out.println("employee2\nid is " + emp1.getId());
		System.out.println("name is " + emp1.getName());
	
		
		
		
	}
}
