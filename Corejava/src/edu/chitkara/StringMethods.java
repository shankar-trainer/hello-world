package edu.chitkara;

public class StringMethods {

	public static void main(String[] args) {

		String var1 = "we are learning java";

		System.out.println(var1.length());
		System.out.println(var1.toUpperCase());
		System.out.println(var1.toLowerCase());

		String substring = var1.substring(10);

		System.out.println(substring);
		substring = var1.substring(5,15);

		System.out.println(substring);

	}
}
