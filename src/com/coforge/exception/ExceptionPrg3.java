package com.coforge.exception;

import java.util.Scanner;

public class ExceptionPrg3 {

	static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner scanner =null;

		try {
			scanner= new Scanner(System.in);
        System.out.println("Division result is "+division(scanner.nextInt(), scanner.nextInt()));
		}
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("finally block");
		}
        
	}

}
