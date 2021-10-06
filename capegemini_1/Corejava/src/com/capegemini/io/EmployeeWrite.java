package com.capegemini.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectOutputStream stream=new ObjectOutputStream
	(new FileOutputStream("C:\\corejava\\capegemini\\emp.txt"));
	
   Employee employee1=new Employee(1001, "ram kumar", 12000,"Nepal");		
   Employee employee2=new Employee(1002, "mohan kumar", 15000,"SriLanka");		
		
   stream.writeObject(employee1);		
   stream.writeObject(employee2);		
System.out.println("object saved ");

   
	}
}
