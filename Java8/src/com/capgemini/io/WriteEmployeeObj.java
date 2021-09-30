package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteEmployeeObj {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("c:\\welcome1\\emp.txt"));

		Employee emp1 = new Employee(1001, "suresh lalit", 12000);
		Employee emp2 = new Employee(1002, "amitesh anand", 18000);
		Employee emp3 = new Employee(1003, "shubham anand", 75000);
		
		
		Employee.country="nepal";

		os.writeObject(emp1);
		Employee.country="srilanka";
		os.writeObject(emp2);
		os.writeObject(emp3);
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream("c:\\welcome1\\emp.txt"));

		Employee emp11 = (Employee) is.readObject();
		Employee emp22 = (Employee) is.readObject();
		Employee emp33 = (Employee) is.readObject();

		System.out.println(emp11);
		System.out.println(emp22);
		System.out.println(emp33);
		
		is.close();
		
	}
}
