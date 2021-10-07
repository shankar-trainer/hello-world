
package com.capg;

public class Factorial {
	public static int factorial(int a) {
		int fact = 1;
		for (int i = 1; i <=a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(Factorial.factorial(5));
	}

}
