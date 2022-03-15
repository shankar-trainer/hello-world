package com.capgemini.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePerson {

	public static void main(String[] args) throws IOException {
		
		Person person1=new Person(10001,"anand kumar", 78000,"srilanka");
		Person person2=new Person(10002,"neel kanth  kumar", 78000,"nepal");
	
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream(("c:\\welcome\\person.ser")));
		
		stream.writeObject(person1);
		stream.writeObject(person2);
		
		stream.close();
		System.out.println("object added");
	}
}
