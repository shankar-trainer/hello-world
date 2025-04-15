package org.com.pl;

import org.com.spel.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("student.xml");

		Student student = beanFactory.getBean("st1", Student.class);

		System.out.println(student);

	}
}
