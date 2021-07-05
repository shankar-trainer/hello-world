package com.cts.error;

import java.util.Scanner;

public class ExceptionProgram3 {

	int divide(int a, int b) throws ArithmeticException {
		if (b == 0)
			try {
				throw new ArithmeticException(" denominator is zero ");
			} catch (ArithmeticException e) {
				System.out.println("error at divide method " + e.getMessage());
				throw e;
			}

		return a / b;
	}

	public static void main(String[] args) {
		ExceptionProgram3 program3 = new ExceptionProgram3();
		Scanner scanner = null;
		try {
			System.out.println(program3.divide(12, 2));
			scanner = new Scanner(System.in);
			System.out.println(program3.divide(12, 0));
		} catch (ArithmeticException e) {
			System.err.println("error in main method " + e.getMessage());
		} finally {
			scanner.close();
			System.out.println("finally called ");
		}
	}
}
