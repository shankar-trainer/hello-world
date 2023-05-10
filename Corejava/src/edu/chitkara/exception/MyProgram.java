package edu.chitkara.exception;

import java.util.Scanner;

public class MyProgram {

	static int factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("program starts\n");
		try {
			int p = new Scanner(System.in).nextInt();
			System.out.println("factorial of " + p + " is " + factorial(p));
		} catch (java.util.InputMismatchException e) {
			System.err.println(e);
		}
		System.out.println("\nprogram ends");

	}

}
