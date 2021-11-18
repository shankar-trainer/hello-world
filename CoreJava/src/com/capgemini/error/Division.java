package com.capgemini.error;

import java.util.Scanner;

public class Division {

	public int divide(int a, int b) {
		if (b == 0)
			throw new RuntimeException("divided by zero error");

		return a / b;
	}

	public static void main(String[] args) {

		System.out.println("program starts ");
		Division division = new Division();

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			System.out.println("division result is " + division.divide(12, 3));
			System.out.println("division result is " + division.divide(12, 10));
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
			// System.out.println(e.getMessage());
			// e.printStackTrace();
		} finally {
			System.out.println("finally block called ");
			scanner.close();
		}

		System.out.println("program ends ");

	}

}
