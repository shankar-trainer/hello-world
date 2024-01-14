package edu.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain1 {
	static void display(Person[] p) {
		for (Person person : p) {
			System.out.println(person);
		}
	}

	public static void main(String[] args) {

		int id[] = { 10002, 10001, 10003, 10007, 1006 };
		String nm[] = { "suman kumar", "aman kumar", "ram kumar", "anil kumar", "sunil kumar" };
		float sal[] = { 20000, 34000, 90000, 12000, 45000 };

		Person person[] = new Person[5];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(id[i], nm[i], sal[i]);
		}

		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
			}
		};

		Comparator<Person> comparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());

		Arrays.sort(person, comparator);
		System.out.println("sort by id ");
		display(person);

		Arrays.sort(person, comparator1);
		System.out.println("sort by name ");
		display(person);

	}

}
