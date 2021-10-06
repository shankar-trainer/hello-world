package com.capegemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream inputStream=new ObjectInputStream(
				new FileInputStream("C:\\corejava\\capegemini\\emp.txt"));
		
Employee  employee1= (Employee) inputStream.readObject();
Employee  employee2= (Employee) inputStream.readObject();

System.out.println("Employee1 data  ");
System.out.println(employee1.getId()+"  "+employee1.getName()+" "+employee1.getSalary()+"   "+employee1.getCountry());

System.out.println("Employee2 data  ");
System.out.println(employee2.getId()+"  "+employee2.getName()+" "+employee2.getSalary()+"  "+employee2.getCountry());


	}
}
