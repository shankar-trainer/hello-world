package com.cognizant.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CustomerReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties properties=new Properties();
		properties.load(new FileInputStream("customer.properties"));
		
		System.out.println(properties.get("customerId"));
		System.out.println(properties.get("customerName"));
		System.out.println(properties.get("customerSalary"));
		
	}
}
