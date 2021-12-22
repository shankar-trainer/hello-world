package com.cognizant.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesProgram {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p=new Properties();
		
		p.setProperty("isbn", "76766776");
		p.setProperty("bname","java beginner");
		p.setProperty("cost", "1200");
		
				p.store(new FileOutputStream("book.properties"), null);
				System.out.println("done");
	}
}
