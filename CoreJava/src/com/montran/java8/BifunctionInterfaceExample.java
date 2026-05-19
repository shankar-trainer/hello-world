package com.montran.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionInterfaceExample {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
		System.out.println(biFunction.apply(11, 22));

		BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> {
			return Integer.max(a, b);
		};

		System.out.println(biFunction1.apply(11, 33));
		// BiFunction<Integer, Integer, Integer> biFunction2=(a,b)->Integer.sum(a, b);

		BiFunction<Integer, Integer, Integer> biFunction2 = Integer::sum;
		System.out.println(biFunction2.apply(11, 33));

		Function<Integer, Integer> function = (a) -> a * a;

		String s1 = "234";
		String s2 = "235";
		// Function<String, Integer> function1=(a)-> Integer.valueOf(a);
		Function<String, Integer> function1 = Integer::valueOf;
		
		int res=function1.apply(s1)+function1.apply(s2);
		
		System.out.printf("\nsum of %s and %s is %d",s1,s2,res);

	}
}
