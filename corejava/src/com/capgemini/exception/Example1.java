package com.capgemini.exception;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("start of the program");
		try {
			int x = 10 / 0;
			int arr[]= {1,2,3,4,5};
			
			System.out.println("result is " + x);
			System.out.println(arr[5]);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("division error ");
		}
		
		System.out.println("end of program");
	}
}
