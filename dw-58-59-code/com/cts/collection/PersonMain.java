package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class PersonSortById implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
	   if ( o1.getId()>o2.getId())
		   return 1;
	   else	 if ( o1.getId()<o2.getId())
		   return -1;
	   else 
		   return 0;
	}
}
class PersonSortByName implements Comparator<Person>{
	
	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().compareTo(o2.getName())>0)
			return 1;
		else if (o1.getName().compareTo(o2.getName())<0)
			return -1;
		else
			return 0;
	}
}


public class PersonMain {
	public static void main(String[] args) {
		Person person[]=new Person[3];
		
		person[0]=new Person(7667676, "suman kumar", 12000);
		person[1]=new Person(7667671, "pradip kumar", 11000);
		person[2]=new Person(7667672, "chandrkant kumar", 15000);

		Arrays.sort(person, new PersonSortById());
		System.out.println("sorted by id ");
		for (Person person2 : person) {
			System.out.println(person2);
		}
		
		Arrays.sort(person, new PersonSortByName());
		System.out.println("\nsorted by Name \n");
		for (Person person2 : person) {
			System.out.println(person2);
		}
	}
	
}
