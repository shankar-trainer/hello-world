package com.montran.collection;

import java.util.Arrays;
import java.util.Comparator;

class PersonSortById implements Comparator<Person>{
	@Override
	public int compare(Person arg0, Person arg1) {
		return new Integer(arg1.getPersonId()).compareTo(new Integer(arg0.getPersonId()));
	}	
}
class PersonSortByName implements Comparator<Person>{
	@Override
	public int compare(Person arg0, Person arg1) {
		return arg1.getPersonName().compareTo(arg0.getPersonName());
	}	
}

public class PersonMain {
	  static void printPerson(Person p[]) {
		  for (Person person2 : p) {
				System.out.println(person2.getPersonId()+"  "+person2.getPersonName()+"  "+person2.getPersonSalary());
			}  
	  }
	
	public static void main(String[] args) {
		Person person[]=new Person[4];
		
		person[0]=new Person(7887, "parvin kumar", 20000);
		person[1]=new Person(7881, "jayant kumar", 10000);
		person[2]=new Person(7889, "amit kumar", 30000);
		person[3]=new Person(7882, "suman kumar", 12000);
		
		Arrays.sort(person,new PersonSortById());
		System.out.println("sort by id ");
		printPerson(person);
		
		Arrays.sort(person,new PersonSortByName());
		System.out.println("sort by name ");
		printPerson(person);
		
	}
}
