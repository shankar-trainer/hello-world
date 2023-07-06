package com.coforge;

public class Employee {

	public int id;

	public String name;
	protected String country="india";

	public void show() {
		System.out.println("Employee data");
		System.out.println("\tid " + id);
		System.out.println("\tname " + name);
	}
}
