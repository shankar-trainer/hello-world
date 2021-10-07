package com.capgemini.regex;

public class Example2 {

	public static void main(String[] args) {
		
		String s="hello";
		System.out.println(s.matches("[a-z]"));// [a-z] -- single charcater 
		System.out.println(s.matches("[a-z]+"));//// [a-z] -- one or motre  
				
		System.out.println("a".matches("[a-z]"));
		System.out.println("a".matches("[a-z]+"));
		
		
		String name="mohan";
		if(name.matches("[a-z]{5}"))
			System.out.println("name is valid ");
		else 
			System.out.println("name is not valid ");
		
       	// name length should be of 5 or 10 chars  {5,10}
		
		System.out.println("mohankumar".matches("[a-z]{5,10}"));
		System.out.println("Mohankumar".matches("[a-z]{5,10}"));
	   	
		String age="10";
		System.out.println(age.matches("[0-9]+"));
	   	// \s space 
	   //name must of two words with space berween	
		
		System.out.println("mohan kumar".matches("[a-z]+\\s[a-z]+"));
		
	}
}
