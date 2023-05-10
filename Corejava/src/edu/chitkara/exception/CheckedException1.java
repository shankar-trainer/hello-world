package edu.chitkara.exception;

import java.sql.SQLException;

public class CheckedException1 {
	static int addition(int a, int b) {
		if (b == 0)
			throw new IllegalArgumentException("denominator can not be zero");
//		throw new Exception("denominator can not be zero");
		// throw new SQLException("denominator can not be zero");

		else
			return a / b;
	}

	public static void main(String[] args) {
		System.out.println("program starts");
		int a = 10;
		int b = 0;
		try {
			System.out.println("division of " + a + " and " + b + " is " + addition(a, b));
		} catch (Exception e) {
			System.err.println("main method error " + e.getMessage());
		}

		System.out.println("program ends ");
	}

}
