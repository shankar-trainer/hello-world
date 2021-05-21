package com.cts.Exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Program starts ");

		try {
			int x = 10 / 2;// java.lang.ArithmeticException
			System.out.println(x);
		}

		catch (ArithmeticException e) {
			System.out.println("divion by zero error");
		}
		try {
			int ar[] = { 11, 22, 33, 4, 55 };
			System.out.println(ar[4]);
			Integer p=null;
			System.out.println(p.intValue());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index error at " + e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("error is "+e.getMessage());
		}

		System.out.println("Program ends ");

	}
}
