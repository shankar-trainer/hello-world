package com.capgemini.error;
public class DivideByZero {

	public static void main(String[] args) {
		
		System.out.println(1.0/0);
		System.out.println(-1.0/0);
		
		//System.out.println(1/0);
		//java.lang.ArithmeticException: / by zero
		// no infinity is defined in Integer 
		
		int ar[]= {1,2,3,4,5};
		//System.out.println(ar[5]);
		//java.lang.ArrayIndexOutOfBoundsException: 5
		
		String name=null;
		System.out.println(name);
		//System.out.println(name.length());
		//java.lang.NullPointerException

		String city="delhi";
		char ch[]={'a','a','g','r','a'};
		String city1=new String(ch);
			
		//String is array of character;
		
		System.out.println(city1.charAt(4));
		//System.out.println(city1.charAt(5));
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 5

		
	}
}
