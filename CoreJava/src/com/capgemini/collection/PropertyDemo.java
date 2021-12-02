package com.capgemini.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		
		properties.put("country","india");
		properties.put("state","delhi");
		
		properties.store(new FileOutputStream("user.properties"),"");
		        //store write the properties list into properties file 
		
		//load read the properties list from properties file 
		properties.load(new FileInputStream("user.properties"));
		
		System.out.println(properties.get("country"));
		System.out.println(properties.get("state"));
	}
}
