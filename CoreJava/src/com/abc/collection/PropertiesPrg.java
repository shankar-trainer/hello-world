package com.abc.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPrg {

	public static void main(String[] args) {
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("database.properties"));
		    
		System.out.println("driver is "+	properties.get("driver"));
		System.out.println("user is "+	properties.get("user"));
		System.out.println("password is "+	properties.get("password"));
		System.out.println("url is "+	properties.get("url"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
