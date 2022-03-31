package com.capgemini.beans;

public class SingletonPerson {

	public static void main(String[] args) {
		
		//Person person=new Person();
		
		Person person=Person.getPersonInstance();
		
		person.setId(10001);
		person.setName("sunil kumar");
		
		Person person1=Person.getPersonInstance();
		
		person1.setId(10002);
		person1.setName("anil kumar");
		
		
		System.out.println(person.getId()+" "+person.getName());
		System.out.println("-----------------");
		System.out.println(person1.getId()+" "+person1.getName());
		
	}
}
