package com.cognizant;

public class PersonMain {

	public static void main(String[] args) {
		Person person=new Person(1001, "arvind kumar", 20,"delhi");
		System.out.println(person);
		System.out.println(person.getLocation());
	}
}
