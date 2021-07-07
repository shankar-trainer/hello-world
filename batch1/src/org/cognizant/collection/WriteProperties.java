package org.cognizant.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class WriteProperties {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream stream=new FileOutputStream("emp.properties");
		Properties properties=new Properties();
		
		properties.setProperty("10001","madan kumar");
		properties.setProperty("10002","sohan kumar");
		properties.setProperty("10003","anil kumar");
		properties.setProperty("10004","sunil kumar");
		
		properties.store(stream, "");
		
		System.out.println(properties.getProperty("10001"));
				
		stream.close();
	
		FileInputStream fileInputStream=new FileInputStream("emp.properties");
		
		Properties properties2=new Properties();
		properties2.load(fileInputStream);
		Set<Object> keySet = properties2.keySet();
		
	    for (Object object : keySet) {
			System.out.println(object+"  "+properties2.get(object));
		}
	
	}
}
