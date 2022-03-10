package com.capgemini.exception;

public class ExaceptionPrg1 {

	public static void main(String[] args) {
		System.out.println("start of program");
		
		System.out.println(1.0/0);// infinity is defined in decimal
		
		//System.out.println(1/0);// no infinity defined in Integer
		//java.lang.ArithmeticException
		
		
		int ar[]= {1,2,3,4,5};
		//System.out.println(ar[5]);//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		Integer x=0;
		Integer x1=null;// not pointing to any object 
		String s=null;//
		
		
		//System.out.println(x1.intValue());
		//java.lang.NullPointerException: 
		
		//System.out.println(s.length());
		//java.lang.NullPointerException:

		 String name="ram";
		 
		 //System.out.println(name.charAt(3));// java.lang.StringIndexOutOfBoundsException
		
		 String n1="123a";
		 
        int p=Integer.parseInt(n1);//java.lang.NumberFormatException
		 
		System.out.println("end of program");
	}
}
