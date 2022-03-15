package com.capgemini.string;

public class StringPool {

	public static void main(String[] args) {

		String s1 = "hello"; // string pool -- obj1
		String s2 = "hello"; // string pool obj1

		String s3 = new String("hello");
		// outside string pool -- obj2

		/*
		 * s1, s2 -- refers same object 
		 * s3 refers different object 
		 * == -- double equal checks references 
		 * .equals -- checks content
		 */
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		 System.out.println("----------");
		 System.out.println("hello"=="hello");// both will be created inside string pool
		 System.out.println("hello"==new String("hello"));
		 System.out.println("hello".equals(new String("hello")));
	}
}
