package com.audintel.main;

import com.audintel.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setRoll(87888);
		student.setName("ram kumar");
		student.setSubject("Mathematics");
		
		System.out.println("student information ");
		System.out.println("roll is "+student.getRoll());
		System.out.println("name is "+student.getName());
		System.out.println("subject is "+student.getSubject());
	}
}
