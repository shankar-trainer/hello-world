package com.capgemini.string;

public class StringPrg2 {

	public static void main(String[] args) {
		String var1="hello";
		String var2="hello";
		
        // String is immutable 
		
		System.out.println(var1);
		var1.concat("world");
		System.out.println(var1);
		
	String var3=	var1.concat("world");
		
		System.out.println(var3);
		
	}
}
