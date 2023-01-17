package com.abc.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPrg1 {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		properties.put("id", "enter id");
		properties.put("name", "enter name");
		properties.put("salary", "enter salary");
		properties.put("age", "enter age");
		
		FileOutputStream fileOutputStream=new FileOutputStream("emp.properties");
		
		properties.store(fileOutputStream, "added properties ");

		
		
	}
}
