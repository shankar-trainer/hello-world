package com.capgemini.string;

public class StringExample2 {

	public static void main(String[] args) {

		String s1 = "we are learning java.we will use java to create application ";
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));

		System.out.println("------");
		for (int x = 0; x < s1.length(); x++)
			System.out.print(s1.charAt(x)+",");

		 char[] charArray = s1.toCharArray();
		
		System.out.println(" using for each \n");
		  for(char c:charArray)
			  System.out.print(c+" ,  ");
		
		  System.out.println("code point at  "+s1.codePointAt(0));
		  System.out.println("code point at  "+s1.codePointAt(1));
		  System.out.println("code point at  "+s1.codePointAt(2));
		  
		  int pos=s1.indexOf('a');
		  System.out.println("a found at "+pos);
		  
		  pos=s1.indexOf("we");
		  System.out.println("we found at "+pos);
		  
		  pos=s1.lastIndexOf("we");
		  System.out.println("we  from last position is found at "+pos);
	}
}
