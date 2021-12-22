package edu.cognizant;

import com.cognizant.Student;

public class ClassVStudent  extends Student {
	
	
	public static void main(String[] args) {
		ClassVStudent student=new ClassVStudent();
//default not inherited		//student.country="india";
		student.name="pawan kumar";
		student.roll=4566;
		
	    student.studentInfo();
	}

}
