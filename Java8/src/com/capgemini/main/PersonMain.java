package com.capgemini.main;

import com.capgemini.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(788787);
		person.setName("anand kumar");
		person.setSalary(45000.677f);

		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getSalary());

	}
}
