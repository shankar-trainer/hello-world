package com.capegemini;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		try {
			//int x = 10 / 0;
			int x = 10 / 2;
			System.out.println("Result is " + x);
			int ar[] = { 1, 2, 3, 4, 5 };
			System.out.println("5 th value is " + ar[4]);
			String s=null;
			System.out.println(s.substring(3));
		}

		catch (ArithmeticException e) {
			System.out.println("divided by zero error");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index error at " + e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("Error is " + e.getMessage());
			System.out.println("some error ");
		}
	}
}
