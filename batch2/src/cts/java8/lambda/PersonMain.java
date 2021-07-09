package cts.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {
	static class PersonSortById implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
		}
	}
	
	public static void main(String[] args) {
		Person person[] = new Person[3];

		person[0] = new Person(788787, "keshav prasad", 12000);
		person[1] = new Person(788781, "sambhu prasad", 11000);
		person[2] = new Person(788790, "mahadev prasad", 18000);

		Arrays.sort(person,new PersonSortById());
		for (Person person2 : person) {
			System.out.println(person2.getId()+"  "+person2.getName()+"  "+person2.getSalary());
		}

	}
}
