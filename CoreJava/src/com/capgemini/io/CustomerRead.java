package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomerRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream inputStream=new ObjectInputStream
				(new FileInputStream("c:\\welcome\\customer.ser"));
		
		Customer cust = (Customer) inputStream.readObject();
		
		System.out.println(cust.id);
		System.out.println(cust.name);
		System.out.println(cust.location);
		System.out.println(Customer.state);
		System.out.println(cust.state);
		
		
		inputStream.close();
		
	}
}
