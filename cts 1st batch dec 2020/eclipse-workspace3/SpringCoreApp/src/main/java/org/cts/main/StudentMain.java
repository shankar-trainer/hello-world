package org.cts.main;

import org.cts.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("application.xml");

		Student student  = beanFactory.getBean("student1", Student.class);
		
		System.out.println(student);
		
		Student student1  = beanFactory.getBean("student2", Student.class);
		
		System.out.println(student1);
		
	}
}
