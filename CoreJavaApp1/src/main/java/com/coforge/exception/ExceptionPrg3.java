package com.coforge.exception;

public class ExceptionPrg3 {

	public static void main(String[] args) {
		try {
			int x = 10 / 0;

			System.out.println(x);
		}
		catch (ArithmeticException e) {
			System.err.println("divided by zero");
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			String age = "22a";
			int a = Integer.parseInt(age);
			System.out.println(a);

		} 
		catch (NumberFormatException e) {
			System.err.println("number format error ");
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
