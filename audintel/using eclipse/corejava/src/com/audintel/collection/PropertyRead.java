package com.audintel.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String[] args) {
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("product.properties"));
			System.out.println("Id is "+properties.get("prd.prdId"));
			System.out.println("Name is "+properties.get("prd.prdName"));
			System.out.println("Cost is "+properties.get("prd.prdCost"));
			
			
		} catch (IOException e) {
		System.err.println(e);
		}
		Properties properties1=new Properties();
		try {
			properties1.put("isbn", "78678787");
			properties1.put("bname", "spring in action");
			properties1.put("author", "craig wall");
			properties1.put("cost", "2000.00f");
			properties1.store(new FileOutputStream("book.properties"), "book records");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
