package com.capgemini.sys;

import java.util.Properties;

public class PropertiesPrg1 {

	public static void main(String[] args) {
		
		Properties properties = System.getProperties();
		
	   System.out.println(properties);
	   
	   System.out.println("java.runtime.name  ----->  "+System.getProperty("java.runtime.name"));
	   System.out.println("user.country  ----->  "+System.getProperty("user.country"));
	   System.out.println("user.dir  ----->  "+System.getProperty("user.dir"));
	   
	   
		
	}
}
