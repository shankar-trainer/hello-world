package com.coforge.exception;

import java.util.Scanner;

public class Calculation {

	static int division(int a, int b) throws Exception {
		if (b == 0) {
			// throw new RuntimeException("second no is zero");
			try {
				throw new Exception("second no is zero");
			} catch (Exception e) {
				System.err.println("error at at method division " + e.getMessage());
				throw e;
			}
		} 
		else
			return a / b;
		//return 0;
	}

	public static void main(String[] args) {
		System.out.println("start of program");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("No1 is " + a);
		System.out.println("No2 is " + b);

		try {
			System.out.println("division is " + division(a, b));
		} catch (Exception e) {
			System.err.println(e + " error at main method  " + e.getMessage());
			// e.printStackTrace();
		}

		scanner.close();
		System.out.println("end  of program");
	}
}
