package com.capgemini.error;

public class ExceptionType2 {

	static void divide(int a, int b) throws Exception {
		if (b == 0)
			throw new Exception("denominator is zero");// checked exception , handled by throws and try-catch
		else
			System.out.println("Division is " + (a / b));
	}

	public static void main(String[] args) {
		System.out.println("program starts ");

		try {
			divide(11, 10);
			divide(11, 12);

			divide(11, 0);
//			divide(110, 11);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			// e.printStackTrace();
		} finally {
			System.out.println("finally block ");
		}
		try {
			divide(110, 11);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("program ends");
	}
}
