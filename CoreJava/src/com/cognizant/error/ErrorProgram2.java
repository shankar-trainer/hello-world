package com.cognizant.error;

public class ErrorProgram2 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		int ar[]= {1,2,3,4};
	    String name=null;
		try {
		//System.out.println(ar[4]);
		System.out.println(ar[2]);//java.lang.ArithmeticException
		System.out.println("name is "+name);
		System.out.println("length of name is "+name.length());
		//java.lang.NullPointerException
		}
		catch (Exception e) {
		  System.out.println("Error is "+e);
		}
		System.out.println("program ends ");
	}
}
