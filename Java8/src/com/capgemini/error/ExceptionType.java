package com.capgemini.error;

public class ExceptionType {

	static void divide(int a, int b) {
		if (b == 0)
			throw new RuntimeException("denominator is zero");
		else
			System.out.println("Division is " + (a / b));
	}

	public static void main(String[] args) {
		System.out.println("program starts ");
		// System.out.println(1/0);// unchecked exception
		// subclass of runtime exception

		divide(11, 10);
		divide(11, 12);
		try {
			divide(11, 0);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("program ends");

		divide(110, 11);

	}
}
