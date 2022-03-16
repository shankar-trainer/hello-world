package com.capgemini.beans;

import java.util.Objects;

public class Person {

	private int id;
	private String name;
	private float salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	public static void main(String[] args) {
		Person person1=new Person();
		person1.setId(10001);
		person1.setName("amit kumar");;
		person1.setSalary(12000);
		
		Person person2=new Person();
		person2.setId(10001);
		person2.setName("amit kumar");;
		person2.setSalary(12000);
		
		System.out.println(person1.equals(person2));
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
	}
	
}
