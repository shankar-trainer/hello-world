package org.cts.main;

import org.cts.beans.Person;
import org.cts.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("application.xml");

		Person p  = beanFactory.getBean("person1", Person.class);
		
		System.out.println(p);
		
		System.out.println("Person Information");
		
		
	}
}
