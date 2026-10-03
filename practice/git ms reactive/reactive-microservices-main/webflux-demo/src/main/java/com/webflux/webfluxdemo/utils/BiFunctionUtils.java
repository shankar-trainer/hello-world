package com.webflux.webfluxdemo.utils;

import java.util.function.BiFunction;

public class BiFunctionUtils {

	private static BiFunction<Integer, Integer, Integer> sumTwoNumbers = (num1, num2) -> {
		return num1 + num2;
	};

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sumTwoNumbersLocal = (num1, num2) -> {
			return num1 + num2;
		};

		Integer result = sumTwoNumbers.apply(2, 3);
		Integer resultLocal = sumTwoNumbersLocal.apply(2, 3);

		System.out.println("result: " + result);
		System.out.println("result: " + resultLocal);
	}

}
