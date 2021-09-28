package com.capgemini.string;

public class StringPrg4 {

	public static void main(String[] args) {
	
		
		String s1="welcome";
		String s2="welcome";
		String s3="WeLcOme";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
	
		// indexOf -- it will search and return the position 
		
		
		String var="we are learning java.now we have java 8 also ";
		
		System.out.println(var.indexOf("java"));
		System.out.println(var.lastIndexOf("java"));
		System.out.println(var.lastIndexOf("java11"));
		
		if(var.indexOf("java")>=0)
			System.out.println("found");
		else 
			System.out.println("not found");

		System.out.println(var.lastIndexOf(97));
		System.out.println((char)97);

		
		
	}
}
