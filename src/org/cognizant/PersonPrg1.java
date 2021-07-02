package org.cognizant;

import com.cognizant.Person;

public class PersonPrg1  extends Person{

	public PersonPrg1(int personId, String personName, int personAge, String location) {
		super(personId, personName, personAge, location);
	}

	public static void main(String[] args) {
		Person person=new Person(566565, "rajesh kumar",30,"madurai");
		System.out.println(person);
		
		PersonPrg1 prg1=new PersonPrg1(566565, "rajesh kumar",30,"madurai");
		
		System.out.println(prg1.getLocation());
	}
}
