package com.cts.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream
				("c:/hello/emp1.txt"));
		
		Employee emp=null;
		for (int i = 0; i <=2; i++) {
			emp=(Employee) inputStream.readObject();
			System.out.println(emp);
		}
		
		inputStream.close();
		
	}
}
