package com.montran.java8;

import java.util.function.Predicate;

public class PredicateEx1 {

	public static void main(String[] args) {

		Predicate<String> predicate1 = a -> a.length() >= 10;

		System.out.println(predicate1.test("hello"));
		System.out.println(predicate1.test("hello world"));

		Predicate<String> negate = predicate1.negate();

		System.out.println(negate.test("hello"));
		System.out.println(negate.test("hello world"));

		Predicate<Integer> evenno = a -> a % 2 == 0;
		Predicate<Integer> nogt10 = a -> a > 10;

		System.out.println(evenno.test(12));
		System.out.println(evenno.test(121));
		System.out.println(nogt10.test(12));

		Predicate<Integer> evenno_gt_10 = evenno.and(nogt10);

		System.out.println(evenno_gt_10.test(6));
		System.out.println(evenno_gt_10.test(60));
		
		
	}
}
