package com.capgemini.error;

public class ExaceptionPrg3 {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println("program  starts  ");
		try {
			System.out.println(x / y);
			System.out.println(ar[5]);	
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("some error " + e.getMessage());
		}

		System.out.println("program ends ");
	}
}
