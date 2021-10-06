package com.capegemini.java8;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonMain1 {

	public static void main(String[] args) {

		int id1[] = { 1009, 1002, 1004, 1001 };
		String name[] = { "mohan kumar", "aman kumar", "chandan kumar",
				"jeevan kumar" };
		float salary[] = { 20000, 15000, 25000, 9000 };

		Comparator<Person> comp1 = new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		TreeSet<Person> treeSet1 = new TreeSet<Person>(comp1);

		TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		TreeSet<Person> treeSet2 = new TreeSet<Person>((o1, o2) -> o1.getName()
				.compareTo(o2.getName()));

		Person person[] = new Person[4];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(id1[i], name[i], salary[i]);
			treeSet.add(person[i]);
		}

		for (Person person1 : treeSet)
			System.out.println(person1);
	}
}
