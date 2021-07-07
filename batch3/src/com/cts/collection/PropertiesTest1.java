package com.cts.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties properties = new Properties();

		properties.setProperty("1001", "deepak kumar");
		properties.setProperty("1002", "aman kumar");
		properties.setProperty("1003", "harmesh kumar");

		properties.store(new FileOutputStream("emp.properties"), null);

	}

}
