package com.capgemini.beans;

public class Person {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	private Person() {
	}

	static Person person;

	static Person getPersonInstance() {
		if (person == null) {
			person = new Person();
		}
		return person;
	}
}
