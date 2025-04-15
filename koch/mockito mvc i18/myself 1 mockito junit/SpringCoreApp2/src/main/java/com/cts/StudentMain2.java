package com.cts;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.dao.StudentDaoImpl;
import com.cts.model.Student;

public class StudentMain2 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		StudentDaoImpl dao = ctx.getBean("studentDaoImpl", StudentDaoImpl.class);

		Student student = new Student();
		student.setRoll(1001);
		student.setName("a kumar");
		student.setSubject("Math");

		Student student1 = new Student();
		student1.setRoll(1002);
		student1.setName("p kumar");
		student1.setSubject("Science");

		dao.addStudent(student1);
		dao.addStudent(student);

		for (Student s : dao.getAllStudent())
			System.out.println(s);

	}
}
