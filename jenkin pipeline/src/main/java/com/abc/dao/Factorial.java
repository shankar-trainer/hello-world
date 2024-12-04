
package com.abc.dao;

public class Factorial {
	public static int factorial(int a) {
		int fact = 1;
		for (int i = 1; i <=a; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
