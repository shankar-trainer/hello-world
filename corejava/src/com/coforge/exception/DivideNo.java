package com.coforge.exception;

import java.util.Scanner;

public class DivideNo {

	static int divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException(" denominator  can not be zero");
		return a / b;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		try {
			System.out.println("division of " + x + " and " + y + " is " + divide(x, y));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("finally block ");
			scanner.close();
		}
		System.out.println("program ends ");
	}

}
