package com.montran.error;

public class ErrorPrg2 {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4 };
		String s = null;
		try {
			// System.out.println(ar[4]);// instance of ArithmeticException
			System.out.println(ar[2]);// instance of ArithmeticException
			System.out.println(10 / 0);
			// System.out.println(10/2);
			System.out.println(s.length());

		}

		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.err.println("array index error "); }
		 * 
		 * catch (ArithmeticException e) { System.err.println("division by zero error "
		 * + e.getMessage()); }
		 */

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println("error is " + e.getMessage());
		} catch (Exception e) {
			// System.out.println("some error " + e);
			e.printStackTrace();
		}

	}
}
