package com.cts.model;

public class Person {
	
	private int personId;
	private  String personName;
	private  float personSalary;
	
	public Person(int personId, String personName, float personSalary) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSalary = personSalary;
	}
	
	public void cleanup() {
		System.out.println("clean up called");
	}

	public void init() {
		System.out.println("init called ");
		this.personId=9898098;
		this.personName="samridhi";
		this.personSalary=56000;
	}
	
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personSalary=" + personSalary + "]";
	}
	
	
	

}
