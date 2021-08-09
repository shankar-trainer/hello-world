package com.montran.collection;

public class Person {

	private int personId;
	private String personName;
	private float personSalary;

	public Person(int personId, String personName, float personSalary) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSalary = personSalary;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public float getPersonSalary() {
		return personSalary;
	}

}
