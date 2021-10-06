package com.capgemini.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	static int factorial(int p) {
		int fact = 1;
		for (int i = 1; i <= p; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		System.out.println(Integer.max(11, 22));
		Supplier<Integer> supplier = () -> Integer.max(11, 22);

		System.out.println("max is " + supplier.get());

		Integer ar[] = { 1, 2, 3, 4, 5, 6 };
		List<Integer> asList = Arrays.asList(ar);

		Supplier<List<Integer>> supplier1 = () -> Arrays.asList(ar);
		List<Integer> list = supplier1.get();

		System.out.println(list);
		
		Supplier<Integer> supplier4 = () -> SupplierExample.factorial(5);
		System.out.println("factorial is "+supplier4.get());

	}
}
