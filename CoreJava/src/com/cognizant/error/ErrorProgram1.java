package com.cognizant.error;

public class ErrorProgram1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4};
	//	System.out.println(ar[4]);//java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(1.0/0);
		//System.out.println(1/0);//java.lang.ArithmeticException
		
		Integer x=null;
		//System.out.println(x.intValue());//java.lang.NullPointerException
		String s=null;
		//System.out.println(s.length());//java.lang.NullPointerException
		
		String s2="hello";
		
		//System.out.println(s2.charAt(5));//java.lang.StringIndexOutOfBoundsException
		
		String p="123a";
		int p1=Integer.parseInt(p);//java.lang.NumberFormatException
	}
}
