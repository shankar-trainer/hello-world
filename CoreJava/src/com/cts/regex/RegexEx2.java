package com.cts.regex;

public class RegexEx2 {
	
	public static void main(String[] args) {
				System.out.println("using ^abc \n ");
		
		System.out.println("z".matches("[^abc]"));
		
		System.out.println("a".matches("[^abc]"));

		System.out.println("using the range a-z ");
		
		System.out.println("a".matches("[a-z]"));// [a-z] range from a-z any character can match 
		
		System.out.println("b".matches("[a-z]"));

		
		System.out.println("0".matches("[a-zA-Z0-9]"));
		System.out.println("Z".matches("[a-zA-Z0-9]"));
		System.out.println("A".matches("[a-zA-Z0-9]"));
		
	}
}
