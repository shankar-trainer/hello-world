package com.nec.exception;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		int x = 10;
		int y = 0;
		// int y = 4;
		String name = null;
		try {
			int z = x / y;
			System.out.println("division of " + x + " and " + y + " is " + z);
		} catch (ArithmeticException e) {
			// System.out.println("division error " + e);
			System.err.println("division error " + e);
			System.err.println("division error " + e.getMessage());
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("some error ");
			System.out.println(e);
		}

		try {
			System.out.println(name + "length is " + name.length());

		} catch (NullPointerException e) {
			System.out.println("null value  error " + e);
		}

		catch (Exception e) {
			System.out.println("some error ");
		}

		System.out.println("program ends ");
	}
}
