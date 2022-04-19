package com.cts.model;

public class Factorial {

	public static int getFactorial(int f) {
		int fact = 1;
		for (int i = 1; i <= f; i++) {
			fact = fact * i;

		}
		return fact;
	}

	
	public static void main(String[] args) {
		System.out.println(Factorial.getFactorial(5));
	}
}
