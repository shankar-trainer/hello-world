package com.capgemini.string;

public class StringExample3 {

	public static void main(String[] args) {
		
		String s1="";
		System.out.println(s1.isEmpty());
		
		String s2="welcome to java";
		
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(3,8));
		
		
		String s3=" hello world ";
		
		System.out.println(s3.length());
		System.out.println(s3.trim().length());
		
	 String val=	String.valueOf(1234.677f);
		
	 System.out.println(s2.concat( " will learn java 8 "));
		
	}
}
