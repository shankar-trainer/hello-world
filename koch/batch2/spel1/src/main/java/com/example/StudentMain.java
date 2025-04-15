package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Student;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student st = (Student) ctx.getBean(Student.class);

		System.out.println(st.getRoll());
		System.out.println(st.getName());
	}
}
