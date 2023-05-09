package com.nec.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesPrg1 {

	public static void main(String[] args) {
		
		Properties properties=new Properties();
		try {
			properties.setProperty("id", "1000");
			properties.setProperty("name", "amit kumar");
			properties.setProperty("salary", "80000");
			properties.store(new FileOutputStream("user.properties"), "User Values");
			
			
			properties.load(new FileInputStream("user.properties"));
			
			Set<Entry<Object, Object>> entrySet = properties.entrySet();
			
			for (Entry<Object, Object> entry : entrySet) {
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
			
			System.out.println("--------");
			
			System.out.println("id is "+properties.getProperty("id"));
			System.out.println("name is "+properties.getProperty("name"));
			System.out.println("salary is "+properties.getProperty("salary"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
