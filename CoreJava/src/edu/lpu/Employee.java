package edu.lpu;

public class Employee {

	public int id;
	public String name;
	protected String location;

	public void empData() {
		System.out.println("emp information ");
		System.out.println("id is " + id);
		System.out.println("name is " + name);
	}
}
