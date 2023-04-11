package com.nec.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {

	public static void main(String[] args) {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		Student student=new Student();
		
		System.out.println("Enter  roll name subject1 marks1 subject2 marks2");
		int roll;
		try {
			roll = Integer.parseInt(reader.readLine());
			student.setRoll(roll);
			student.setName(reader.readLine());

			student.setSubject1(reader.readLine());
			student.setMarks1(Float.parseFloat(reader.readLine()));
			
			student.setSubject2(reader.readLine());
			student.setMarks2(Float.parseFloat(reader.readLine()));
			
			student.setTotal(student.getMarks1()+student.getMarks2());
			
			
			System.out.println("student data ");
			
			System.out.println("roll is "+student.getRoll());
			System.out.println("roll is "+student.getName());
			System.out.println("\tsubject1 is "+student.getSubject1());
			System.out.println("\tmarks1 is "+student.getMarks1());
			System.out.println("\tsubject2 is "+student.getSubject2());
			System.out.println("\tmarks2 is "+student.getMarks2());
			System.out.println("\ttotal marks  is "+student.getTotal());
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
