package com.capgemini.string;

public class StringExample1 {

	public static void main(String[] args) {
		String s1="hello";
		// String is immutable 
		//"" string literal  - it has methods and attributes
		
		s1.concat(" world");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
	}
}
