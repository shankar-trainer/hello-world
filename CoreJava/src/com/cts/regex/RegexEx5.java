package com.cts.regex;

public class RegexEx5 {
	
	public static void main(String[] args) {
		
		 String s="mohan kumar";
		 
		 System.out.println(s.matches("[a-z]+\\s[a-z]+"));
		 
		 s="mohan kumar abc";
		 
		 System.out.println(s.matches("[a-z]+\\s[a-z]+"));
		
		 s="we are learning java";
		 
		 System.out.println(s.matches("^we.*"));//we at  start of the line  ^
		 
		 System.out.println(s.matches(".*java$"));// java at the end of the line $ 
		
		 s="we are learning java . java is not easy .  we can learn it";
		 
		 System.out.println(s.matches(".*(java{2}).*"));// java 2 times any where 

		 System.out.println(s.matches(".*(we{1,2})*."));// java 2 times any where 
		 System.out.println(s.matches(".*(is{1,2})*."));// java 2 times any where 
		 
		 System.out.println(s.matches(".*(abc{1,2})*."));// java 2 times any where 
		 
		 
	}
}
