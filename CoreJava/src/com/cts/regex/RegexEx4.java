package com.cts.regex;

public class RegexEx4 {
	
	public static void main(String[] args) {
		
		System.out.println("xyz".matches("[a-z]*"));
		System.out.println("".matches("[a-z]*"));
		System.out.println("".matches("[a-z]?"));
		System.out.println("a".matches("[a-z]?"));
		System.out.println("a".matches("[a-z]+"));// +  required 1 or more 
		System.out.println("aa".matches("[a-z]+"));// +  required 1 or more 
		
	}
}
