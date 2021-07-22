package com.montran.error;

import java.util.Scanner;

public class AdditionProgram {

	public static void main(String[] args) {
		int x, y;

		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter first no ");
			x = scanner.nextInt();
			if (x <= 0)
				throw new ArithmeticException("invalid no");

			System.out.println("Enter second  no ");
			y = scanner.nextInt();
			if (y <= 0)
				throw new ArithmeticException("invalid no");
			System.out.println("sum is " + (x + y));
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("finally block called ");
			scanner.close();
		}
	}
}
