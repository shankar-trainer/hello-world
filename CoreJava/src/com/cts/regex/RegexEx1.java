package com.cts.regex;

public class RegexEx1 {
	
	public static void main(String[] args) {
		
		String s="hello";
		
		System.out.println(s.matches("[a-z]+"));//+ -- 1 or more
		System.out.println(s.matches("[A-Z]+"));
		
		String age="20";
		
		System.out.println(age.matches("[0-9]+"));
		
		System.out.println("abc".matches("abc"));// whole word match
		System.out.println("abc".matches("[abc]"));// [abc] any single char 
		
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));

		System.out.println("using ^abc \n ");
		
		System.out.println("z".matches("[^abc]"));
		
		System.out.println("a".matches("[^abc]"));
		
		
		
		
	}
}
