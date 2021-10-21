package com.cts;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		//int x=10/0; // java.lang.ArithmeticException
		
		float x=10.0f/0;
		
		System.out.println(x);
		int ar[]= {1,2,3,4,5};
		
		System.out.println(ar[4]);
		//System.out.println(ar[-4]);//java.lang.ArrayIndexOutOfBoundsException
	//	System.out.println(ar[5]);
		
		String s1="hello";
		System.out.println(s1.charAt(4));
		//System.out.println(s1.charAt(5));//java.lang.StringIndexOutOfBoundsException
		
		
		String p=null;
//		System.out.println(p.length());//java.lang.NullPointerException

		Integer k=null;
	//	k.floatValue();
		
		
		//int y=Integer.parseInt("123a");// java.lang.NuberFormatException
		
		
	//	Integer k1=new Integer("123a");// java.lang.NuberFormatException
		
		
	int k9=	new Scanner(System.in).nextInt();//java.util.InputMismatchException
	
		
		
		
	}
}
