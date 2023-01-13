package com.audintel.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeWriteRead {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Employee employee1 = new Employee(6556566, "arvind kumar", 30000, "vijayawada");
		
		Employee employee2 = new Employee(6556568, "raju kumar", 60000, "amaravati");
		Employee employee3 = new Employee(6556569, "vijay kumar", 12000, "nellore");
		
		employee1.state="tamil nadu";
		employee2.state="telengana";
		employee3.state="madhya pardesh";

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("\\welcome\\emp.ser"));

		objectOutputStream.writeObject(employee1);//serialization
		objectOutputStream.writeObject(employee2);
		objectOutputStream.writeObject(employee3);

		objectOutputStream.close();

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/welcome/emp.ser"));
		for (int x = 1; x <= 3; x++) {
			Employee emp1 = (Employee) inputStream.readObject();//deserialization
			System.out.println(emp1);
		}
        inputStream.close();
	}
}
