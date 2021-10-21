package com.capegemini;

public class ExceptionDemo4 {
	public static void main(String[] args) {

		try {
			int x = 10 / 0;
			// int x = 10 / 2;
			System.out.println("Result is " + x);
		}

		catch (ArithmeticException e) {
			System.out.println("divided by zero error");
			System.out.println(e);
			e.printStackTrace();
		}
		try {
			int ar[] = { 1, 2, 3, 4, 5 };
			System.out.println("5 th value is " + ar[5]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index error at " + e.getMessage());
		}
		
		try {
			String s = null;
			System.out.println(s.substring(3));
		}

		catch (Exception e) {
			System.out.println("Error is " + e.getMessage());
			System.out.println("some error ");
		}
	}
}
