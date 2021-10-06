package com.capegemini.io;

public class EmpIdValidation {

	public static void main(String[] args) {
		
		String emp_id="234";
		
		System.out.println(emp_id.matches("\\d+"));
		
		String name="abc&$"; //other than number
		
		System.out.println(name.matches("\\D+"));
		
		//name should be alphanumeric
		
		String name1="mohan123";
		
		System.out.println(name1.matches("\\w+"));
		
		
		
		
		
		
	}
}
