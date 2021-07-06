package cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmplyeeMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("c:\\hello\\emp2.dat"));
		Employee employee1=new Employee(1001, "praveen kumar", 12000,"tamilnadu");
		Employee employee2=new Employee(1002, "harmeet kumar", 15000,"west bengal");
		
		stream.writeObject(employee1);		
		stream.writeObject(employee2);		
		System.out.println("object has been written to the file");
		
		stream.close();
		
		
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("c:\\\\hello\\\\emp2.dat"));
		Employee emp1=(Employee) inputStream.readObject();
		System.out.println(emp1);
		
		Employee emp2=(Employee) inputStream.readObject();
		System.out.println(emp2);
		
		inputStream.close();
	}
}
