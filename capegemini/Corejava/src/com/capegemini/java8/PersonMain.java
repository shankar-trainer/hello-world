package com.capegemini.java8;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {

	public static void main(String[] args) {
		int id1[] = { 1009, 1002, 1004, 1001 };
		String name[] = { "mohan kumar", "aman kumar", "chandan kumar",
				"jeevan kumar" };
		float salary[] = { 20000, 15000, 25000, 9000 };

		Person person[] = new Person[4];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(id1[i], name[i], salary[i]);
		}

		/*
		 * Comparator<Person> sortByName=new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return
		 * o1.getName().compareTo(o2.getName()); } };
		 */

		Comparator<Person> sortByName = (o1, o2) -> o1.getName().compareTo(
				o2.getName());

		Arrays.sort(person, sortByName);
		System.out.println("Sort By Name");
		for (Person person2 : person) {
			System.out.println(person2);
		}

		Comparator<Person> sortBySalary1 = (o1, o2) -> {
			if (o1.getSalary() > o2.getSalary())
				return 1;
			if (o1.getSalary() < o2.getSalary())
				return -1;
			else
				return 0;

		};

		Comparator<Person> sortBySalary = (o1, o2) -> new Float(o1.getSalary())
				.compareTo(new Float(o2.getSalary()));

		Arrays.sort(person, sortBySalary);
		System.out.println("Sort By Salary");
		for (Person person2 : person) {
			System.out.println(person2);
		}

	}

}
