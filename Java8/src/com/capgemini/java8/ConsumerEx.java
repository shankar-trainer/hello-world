package com.capgemini.java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<Integer> cons = (a) -> {
			System.out.println(a);
		};
		Consumer<Integer> cons1 = a -> System.out.println(a);

		cons.accept(100);

		Function<Integer, Integer> fn1 = (a) -> {
			int fact = 1;
			for (int x = 1; x <= a; x++)
				fact = fact * x;
			return fact;
		};

		System.out.println(fn1.apply(6));

		Consumer<Integer> cons2 = a -> System.out.println("factorial is " + a);
		cons2.accept(fn1.apply(5));

		Consumer<Integer> cons3 = (p) ->

		{
			int fact = 1;
			for (int x = 1; x <= p; x++)
				fact = fact * x;
			System.out.println("factorail of " + p + " is " + fact);
		};
		cons3.accept(4);

	}
}
