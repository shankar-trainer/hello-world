package com.capgemini.main;

import com.capgemini.error.StudentException;
import com.capgemini.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		try {
			//student.setRoll(0);
			//student.setRoll(101);
			student.setRoll(1001);
			
			//student.setName("");
			//student.setName("ram");
			student.setName("rameswar parsad");
			student.setSubject("mathematics");
			student.setMarks(35);
			
			System.out.println("student details ");
			System.out.println(student.getRoll());
			System.out.println(student.getName());
			System.out.println(student.getSubject());
		} catch (StudentException e) {
			System.err.println(e.getMessage());
		}
	}
}
