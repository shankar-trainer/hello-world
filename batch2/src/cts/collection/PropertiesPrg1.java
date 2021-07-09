package cts.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPrg1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		
		properties.setProperty("10001", "suman kumar");
		properties.setProperty("10006", "aman kumar");
		properties.setProperty("10002", "raman kumar");
		properties.setProperty("10003", "chaman kumar");
		properties.setProperty("10004", "pawan kumar");
		
		properties.store(new FileOutputStream("user.properties",true), null);
		
	}
}
