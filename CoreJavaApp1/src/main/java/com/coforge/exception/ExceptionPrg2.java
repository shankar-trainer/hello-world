package com.coforge.exception;

public class ExceptionPrg2 {

	public static void main(String[] args) {
		System.out.println("program starts");
		try {
			int x = 10 / 0;
			System.out.println("Result is " + x);

		} catch (Exception e) {
			System.err.println("divided by zero error");
			// System.out.println(e);
//			System.err.println(e);
	//		System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("program ends");
	}
}
