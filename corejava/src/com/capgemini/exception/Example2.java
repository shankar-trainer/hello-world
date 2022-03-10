package com.capgemini.exception;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("start of the program");
		try {
			int x = 10 / 2;
			System.out.println("result is " + x);
			
		}
		catch (ArithmeticException e) {
			System.out.println("division by zero");
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("finally block called ");
		}
		
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[5]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index error ");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("end of program");
	}
}
