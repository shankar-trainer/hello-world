package com.capegemini.java8;

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {
		Function<Integer, Integer> square = (p) -> p * p;
		System.out.println(square.apply(10));

		Function<Integer, Integer> factorial = (p) -> {
			int fact = 1;
			for (int i = 1; i <= p; i++) {
				fact = fact * i;
			}
			return fact;
		};

		System.out.println("factorial of 5 is " + factorial.apply(5));

	}
}
