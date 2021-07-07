package com.cts.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("emp.properties"));

		for (Object o : properties.keySet())

			System.out.println(o + " ----" + properties.get(o));
	}
}
