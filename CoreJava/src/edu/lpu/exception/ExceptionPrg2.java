package edu.lpu.exception;

public class ExceptionPrg2 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		int x = 10;
		try {
			System.out.println("Result is " + x / 0);
		} catch (ArithmeticException e) {

			System.err.println("divided by zero error ");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("error " + e);
		}

		try {
			int ar[] = { 11, 22, 33, 44, 55 };
			System.out.println(ar[5]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			System.err.println("array index error ");
		} catch (Exception e) {
			System.out.println("error " + e);
		}

		System.out.println("program ends ");
	}
}
