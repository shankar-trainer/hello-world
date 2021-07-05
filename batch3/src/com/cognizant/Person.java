package com.cognizant;

public class Person {

	private int personId;
	private String personName;
	private int personAge;
	private String  location;
	
	
	 protected String getLocation() {
		return location;
	}

	public Person(int personId, String personName, int personAge, String location) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.location=location;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
	
	
	
}
