package com.capgemini.string;

public class StringPrg1 {

	public static void main(String[] args) {
		
		String s1="";
		String s2="hello";
		char ar[]= {'a','b','c'};
		String s3=new String(ar);
		
		
		//""  String object 
		//"hello" String object
		
		String var1="hello";
		String var2="hello";
		
		
		System.out.println(var1.equals(var2));
		//charAt -- get character at specific position

		System.out.println(var1.charAt(2));
		System.out.println(var1.length());
		System.out.println(var1.toUpperCase());
			
		
	}
}
