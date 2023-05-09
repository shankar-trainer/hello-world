package com.nec.exception;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("program starts ");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter two number");
			int x = sc.nextInt();
			int y = sc.nextInt();

			int z = x + y;

			System.out.printf("\nsum of %d and %d is %d ", x, y, z);
			z = x / y;

			System.out.printf("\ndivision  of %d and %d is %d ", x, y, z);
		} catch (ArithmeticException e) {
			System.err.println("error is " + e.getMessage());
		} finally {
			System.out.println("\nfinally block called ");
			sc.close();
		}

		try {
			String s = "hello";
			int pos = s.charAt(2);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("error in string is " + e.getMessage());
		}
		System.out.println("program ends ");
	}
}
