package com.cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee employee1 = new Employee(10001, "suresh kumar", 12000);
		Employee employee2 = new Employee(10002, "mahesh kumar", 19000);

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("emp.dat"));
		outputStream.writeObject(employee1);
		outputStream.writeObject(employee2);
		System.out.println("object has been written to the file");

		outputStream.close();
		
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("emp.dat"));
	for (int i = 0; i <2; i++) {
		
		Employee emp1 = (Employee) inputStream.readObject();
		System.out.println(emp1);
	}		
	inputStream.close();
	}
}
