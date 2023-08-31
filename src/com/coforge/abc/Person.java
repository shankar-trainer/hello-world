package com.coforge.abc;

public class Person {

	private int id;
	private  String name;
	private  float salary;
	
	private String city;
	private String state;
	private String country;
	
	public Person(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = PersonData.city;
		this.state = PersonData.state;
		this.country = PersonData.country;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	
	
	
	
}
