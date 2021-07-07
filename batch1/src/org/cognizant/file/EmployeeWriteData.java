package org.cognizant.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeWriteData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream outputStream=new 
				ObjectOutputStream(new FileOutputStream("c:\\welcome\\empdata.dat"));
		
		Employee employee=new Employee(455454,"anil kumar",35000);
		outputStream.writeObject(employee);
		System.out.println("data added ");
		outputStream.close();
		
		
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("c:\\welcome\\empdata.dat"));
		Employee emp= (Employee) inputStream.readObject();
		
		 System.out.println(emp);
	}
}
