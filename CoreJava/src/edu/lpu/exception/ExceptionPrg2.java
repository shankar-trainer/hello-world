package edu.lpu.exception;

public class ExceptionPrg2 {

	public static void main(String[] args) {
		int x = 10;
		try {
			System.out.println("Result is " + x / 0);
		} catch (ArithmeticException e) {

			System.out.println("divided by zero error ");
		} catch (Exception e) {
			System.out.println("error " + e);
		}

		try {
			int ar[] = { 11, 22, 33, 44, 55 };
			System.out.println(ar[5]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index error ");
		} catch (Exception e) {
			System.out.println("error " + e);
		}

	}
}
