package com.cts.error;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		//System.out.println(ar[5]);//java.lang.ArrayIndexOutOfBoundsException
		
	   //System.out.println(12/0);//java.lang.ArithmeticException
	
		String s=null;
		//System.out.println(s.length());//java.lang.NullPointerException
		
		String p1="1323a";
		
		//int a=Integer.parseInt(p1);
		//java.lang.NumberFormatException
	
		String s2="hello";
		System.out.println(s2.charAt(5));//java.lang.StringIndexOutOfBoundsException
		
		
	}
}
