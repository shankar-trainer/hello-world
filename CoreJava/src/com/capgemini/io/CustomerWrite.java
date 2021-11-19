package com.capgemini.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Customer customer=new Customer();

		
		customer.id=778878;
		customer.name="ravi kant";
		customer.location="coimbtore";
		Customer.state="UP";
		customer.state="MP";
		
		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("c:/welcome/customer.ser"));
		
		outputStream.writeObject(customer);
		
		outputStream.close();
	}
}
