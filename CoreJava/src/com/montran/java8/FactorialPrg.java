package com.montran.java8;

import java.util.function.Function;

public class FactorialPrg {

	public static void main(String[] args) {
		Function<Integer, Integer> function = a -> {
			int fact = 1;
			for (int i = 1; i <= a; i++) {
				fact = fact * i;
			}
			return fact;
		};
		
		System.out.println(function.apply(4));
		System.out.println(function.apply(5));
		System.out.println(function.apply(3));
		System.out.println(function.apply(6));
	}
}
