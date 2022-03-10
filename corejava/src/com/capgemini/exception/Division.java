package com.capgemini.exception;

import java.util.Scanner;

public class Division {

	static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = null;
		int x, y, z;
		try {
			sc = new Scanner(System.in);
			System.out.println("enter two no ");
			x = sc.nextInt();
			y = sc.nextInt();
			z = divide(x, y);
			// sc.close();
			System.out.println("Result is " + z);
		}
		// Unreachable code block
		catch (ArithmeticException e) { // ArithmeticException is subclass of Exception
			//System.err.println("divide by zero error");
		//	System.err.println(e.getMessage());// System defined error message
			//System.err.println(e);// Exception class name and message
			e.printStackTrace();// Exception class name and message and line no causing exception 
			
		} catch (Exception e) {
			System.err.println("error is " + e);
		}

		finally {
			System.out.println("finally block called");
			sc.close();
		}

	}
}
