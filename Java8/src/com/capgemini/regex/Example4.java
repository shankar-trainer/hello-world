package com.capgemini.regex;

public class Example4 {

	public static void main(String[] args) {
		
		String name="RamKumar";
		
		System.out.println(name.matches("[a-zA-Z]+"));
		
		String age="20";
		// age match 0 -99
		
		System.out.println(age.matches("[0-9]{1,2}"));
		System.out.println("0".matches("[0-9]{1,2}"));
		System.out.println("99".matches("[0-9]{1,2}"));
		System.out.println("100".matches("[0-9]{1,2}"));
		
		//\\d{1,2} or [0-9]{1,2}
		System.out.println(age.matches("\\d{1,2}"));
		//empid -- alpha numeric 
		
		//[a-zA-Z0-9]+ or \\w+
		System.out.println("emp100029".matches("[a-zA-Z0-9]+"));
		System.out.println("emp100029".matches("\\w+"));
		
		//date 10:10:2009
	
    String s1="java we are learning";
    
    System.out.println(s1.matches("^java.*"));// start with java by sign ^
    System.out.println(s1.matches(".*learning$"));// end with by sign $
     //hexa decimal consists of 0-9 a-f start with # sign total size is 6    
    String hexCode="#123abc";

    System.out.println(hexCode.matches("^#([0-9A-Fa-f]{6})"));
    
	}
}
