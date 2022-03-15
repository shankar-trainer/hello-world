package com.capgemini.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPerson {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream stream=new ObjectInputStream(new FileInputStream("C:\\welcome\\person.ser"));
	Person person1=	(Person) stream.readObject();
	Person person2=	(Person) stream.readObject();
		
	System.out.println("person 1 information");
	 System.out.println("\tid "+person1.getId());	
	 System.out.println("\tname "+person1.getName());	
	 System.out.println("\tsalary "+person1.getSalary());	
	 System.out.println("\tcountry "+person1.getCountry());	
	 
	 System.out.println("\nperson 2 information");
	 System.out.println("\tid "+person2.getId());	
	 System.out.println("\tname "+person2.getName());	
	 System.out.println("\tsalary "+person2.getSalary());	
	 System.out.println("\tcountry "+person2.getCountry());	
	 stream.close();
	}
}
