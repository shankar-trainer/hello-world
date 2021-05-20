package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.model.AppConfig;
import com.cts.model.Student;
import com.cts.model.User;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);

	Student student=applicationContext.getBean(Student.class);
	System.out.println(student.getStudentId());
	System.out.println(student.getStudentName());
	System.out.println(student.getStudentMarks());
	}
}
