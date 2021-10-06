package org.com.edu;

public class Outer1 {
	static String location="chennai";

	static class Employee {
		static String country="india";
        int pin1=98898;
		static void empInfo() {
			System.out.println(Outer1.location);
		}
	}
	
	public static void main(String[] args) {
		
		Outer1.Employee em=new Employee();
		
		System.out.println(Outer1.Employee.country);
		Outer1.Employee.empInfo();
		System.out.println(em.pin1);
	}

}
