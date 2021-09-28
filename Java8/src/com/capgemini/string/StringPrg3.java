package com.capgemini.string;

public class StringPrg3 {

	public static void main(String[] args) {
		String s1 = "cat"; // cat object in string pool
		String s2 = "cat"; // cat object in string pool
		// 2 reference variable
		// 1 object

		String s3 = new String("cat");// cat object outside string pool
		// 3 reference variable 1 object

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s3));

		// == checking if references are equal
		// .equals -- check the content

	}
}
