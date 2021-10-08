package com.capgemini.regex;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("mohankumar".matches("[a-z]{5,10}"));
		System.out.println("Mohankumar".matches("[a-z]{5,10}"));
	   	
		String age="10";
		System.out.println(age.matches("[0-9]+"));
	   	// \s space 
	   //name must of two words with space berween	
		
		System.out.println("mohan kumar".matches("[a-z]+\\s[a-z]+"));
		

	}
}
