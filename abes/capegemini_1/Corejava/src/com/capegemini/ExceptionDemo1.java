package com.capegemini;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("Program starts ");
		System.out.println(10.0/0);
		System.out.println(-10.0/0);
		//System.out.println(-10/0);//java.lang.ArithmeticException
		
		int ar[]={1,2,3,4};
		int ar1[]=new int[]{11,22,33,44,55};
		
		//System.out.println(ar1[5]);
		// java.lang.ArrayIndexOutOfBoundsException
		
		String language="java";
		
		//System.out.println(language.charAt(5));
		//java.lang.StringIndexOutOfBoundsException
		
		String name=null;
		
		//System.out.println(name.length());
		//java.lang.NullPointerException
		
		String n="1234a";
		int p=Integer.parseInt(n);
		//java.lang.NumberFormatException
		
		System.out.println("Program Ends ");
	}
}
