package com.cts;

public class Employee {
	protected String country;

	public int id;
	public String name;
	public float salary;

	public void empInfo() {
		System.out.println("Employee Information");
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
	}
}
