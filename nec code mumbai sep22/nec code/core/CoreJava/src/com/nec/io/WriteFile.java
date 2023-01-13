package com.nec.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setCustomerId(1001);
		customer.setCustomerName("mohammad riyaz");
		customer.setCustomerSalary(78000.00f);;
		customer.setCustomerCountry("nepal");
		
		try {
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("customer.ser"));
		    objectOutputStream.writeObject(customer);
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
