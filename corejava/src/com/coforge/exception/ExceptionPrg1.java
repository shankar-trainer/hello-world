package com.coforge.exception;

public class ExceptionPrg1 {

	public static void main(String[] args) {

		System.out.println("program starts");
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println(ar[4]);
		// System.out.println(ar[5]);//java.lang.ArrayIndexOutOfBoundsException

		String s = "hello";
		System.out.println(s.charAt(0));
		// System.out.println(s.charAt(5));//java.lang.StringIndexOutOfBoundsException

		// Integer x=0;
		Integer x = null;
		String p = null;
		
		//System.out.println(p.length());//java.lang.NullPointerException
		//System.out.println(x.intValue());//java.lang.NullPointerException

		
		String age="12a";
		
		int age1 = Integer.parseInt(age);//java.lang.NumberFormatException
		System.out.println("age is "+(age1+1));
		
		System.out.println("program ends");

	}
}
