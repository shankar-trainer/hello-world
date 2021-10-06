package com.capegemini.java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {

		Function<Integer, Integer> square = p -> p * p;
		Function<Integer, Integer> addOne = p -> p + 1;

		Function<Integer, Integer> square_addOne = square.andThen(addOne);

		int res = square_addOne.apply(6);

		System.out.println(res);
		
		Function<Integer, Integer> comp1=square.compose(square_addOne);
		System.out.println(comp1.apply(4));
		
		Predicate<Integer> predicate= p->p>20;

		System.out.println(predicate.test(10));
		System.out.println(predicate.test(30));
	}
}
