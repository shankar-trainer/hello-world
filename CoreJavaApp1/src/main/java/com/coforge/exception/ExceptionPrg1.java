package com.coforge.exception;

public class ExceptionPrg1 {

	public static void main(String[] args) {
		System.out.println("start of program");
		double x = 10.0 / 0.0;
		System.out.println(x);

		x = -10.0 / 0.0;
		System.out.println(x);
		 //int y=10/0;   // error arithmeticException 
	
		 int ar[]= {1,2,3,4,5};
		 System.out.println(ar[4]);
		 //System.out.println(ar[5]);
		 //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds
		 
		 String s1=null;
		 //System.out.println(s1.length());//java.lang.NullPointerException
		
		 Integer p1=1000;
		 Integer p2=null;
		 
		 String s2="hello";
		 //System.out.println(s2.charAt(5));
		 //java.lang.StringIndexOutOfBoundsException
		 
		 String age="75a";
		 
		 int age1=Integer.parseInt(age);
		 //NumberFormatException
		 
		 System.out.println("end of program");

	}
}
