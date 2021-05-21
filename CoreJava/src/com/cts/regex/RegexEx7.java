package com.cts.regex;

public class RegexEx7 {

	public static void main(String[] args) {

//		String pattern = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
		String pattern = "[\\d]{2}-[\\d]{2}-[\\d]{4}";   //  \\d  -- digit 
		
		String date="11-11-2020";
		String date1="11/11/2020";
		
		System.out.println("date format dd-mm-yyyy");
		
		System.out.println(date.matches(pattern));
		System.out.println(date1.matches(pattern));
		
		// \\D -- non digit 
		
		System.out.println("ram".matches("\\D\\D\\D"));
		System.out.println("%$#".matches("\\D\\D\\D"));
		
		//[a-z] -- small case [A-Z] -- capital case 
		//  \\w  =-- alpha numeric 
		
		//empId prefix CTS 
		
		System.out.println("CTS123ram".matches("^CTS.*"));
		System.out.println("BTS123ram".matches("^CTS.*"));
		
		System.out.println("ramKumar2223".matches("\\w+"));  // name alpha numeric
		
	}
}
