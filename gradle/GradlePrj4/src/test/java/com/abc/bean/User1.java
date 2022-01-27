package com.abc.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class User1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties properties=new Properties();
		properties.put("shoeshize",67);
		properties.put("sweets",250);
		properties.put("java book",1267);
		
		System.out.println(properties.get("shoeshize"));
		
		//Properties -- sub class of map  can read and write .properties file using load and store 
		 
		properties.load(new  FileInputStream("user.properties")); // reading from user.properties file
		
		System.out.println(properties.get("name"));
		System.out.println(properties.get("roll"));
		
		Properties properties1=new Properties();
		
		properties1.setProperty("salary","90000");
		properties1.setProperty("state","UP");
		properties1.setProperty("location","noida");
		properties1.setProperty("country","india");
		
		FileWriter stream=new FileWriter("user1.properties");
		properties1.store(stream,"comment1");   // writing  to user1.properties file
		stream.close();
		
		
	}
}
