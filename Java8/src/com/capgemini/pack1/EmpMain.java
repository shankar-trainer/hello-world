package com.capgemini.pack1;

import java.util.Date;

import com.capgemini.pack.Employee;

public class EmpMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.id=887877;
		emp1.name="suresh kumar";
		
		emp1.info();
		
	 Date date=new Date();
	 System.out.println(date);
	}
}
