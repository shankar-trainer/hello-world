package com.cts.error;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		
		System.out.println(10.0/0);// infinity
		
		//System.out.println(10/0);//java.lang.ArithmeticException: / by zero
		
		int ar[]= {1,2,3,4,5};
		//System.out.println(ar[5]);//java.lang.ArrayIndexOutOfBoundsException: 5
		
		String s=null;
		Integer x=null;
		//System.out.println(x.intValue());//java.lang.NullPointerException
		
		String city="chennai";
		//System.out.println(city.charAt(7));
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 7

		String no1="12222a";
		int d=Integer.parseInt(no1);
		System.out.println(d);
		//java.lang.NumberFormatException
	}
}
