package com.capgemini.error;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {

		System.out.println(1.0 / 0);

		// System.out.println(1/0);
		// java.lang.ArithmeticException: / by zero

		int ar[] = { 1, 2, 3, 4 };
		// System.out.println(ar[4]);
		// java.lang.ArrayIndexOutOfBoundsException: 4

		String var = "hello";

		// char c=var.charAt(5);
		// java.lang.StringIndexOutOfBoundsException

		String age = "18a";
		// int age1=Integer.parseInt(age);
		// java.lang.NumberFormatException

		String s2 = null;
		//System.out.println(s2.length());
		// java.lang.NullPointerException

		Scanner sc = new Scanner(System.in);
         int i=sc.nextInt();
         System.out.println();
		//java.util.InputMismatchException  -- if sc.nextInt()  has out of  range value 
         

	}
}
