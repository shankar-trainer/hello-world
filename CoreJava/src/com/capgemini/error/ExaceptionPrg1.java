package com.capgemini.error;

public class ExaceptionPrg1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println("program  starts  ");
		try {
			System.out.println(x / y);
			System.out.println(ar[5]);	
		}

		catch (ArithmeticException e) {
			System.out.println("divided by zero error");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index error  at " + e.getMessage());
		}

		catch (Exception e) {
			System.out.println("some error " + e.getMessage());
		}

		System.out.println("program ends ");
	}
}