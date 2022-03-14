package com.capgemini.beans;

public class ManagerMain {

	public static void main(String[] args) {
		Manager manager=new Manager();
		
		manager.setId(7879877);
		manager.setName("ananaya sharma");
		manager.setLocation("mathura");
		manager.setSalary(20000);
		manager.setPf(5);
		manager.setHra(10);
		
		manager.empInformation();
	}
}
