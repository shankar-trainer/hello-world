package com.cts.regex;

public class RegexEx6 {

	public static void main(String[] args) {

		String s = "we are learning java";

		System.out.println(s.matches("^we.*"));// we at start of the line ^

		System.out.println(s.matches(".*java$"));// java at the end of the line $
		System.out.println(s.matches(".*are$"));// java at the end of the line $

		
		System.out.println(s.matches(".*\\bjava\\b"));// java at anywhere 
		System.out.println(s.matches(".*\\bare\\b"));// java at end

		System.out.println(s.matches(".*\\bjava\\b.*"));// java at any where

		s = "java java";

		System.out.println(s.matches("(.*java.*){2}"));// java at any where

		System.out.println(s.matches("(java){2}"));// java 2 times any where

		// System.out.println(s.matches(".*(javaaa){2}.*"));// java 2 times any where
	}
}
