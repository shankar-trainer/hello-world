package edu.chitkara;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "hello"; // both refers same object in string pool
		String s2 = "hello";

		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));//true

		String s3 = new String("hello");// create new Object
	
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3));//true

	}
}
