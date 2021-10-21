package com.capegemini.java8;

import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		Stream.of("we are learning java".split(" ")).forEach(System.out::println);
Stream.of("we are learning java".split(" ")).map(String::toUpperCase).
		forEach(System.out::println);

		Integer ar[] = { 1, 2, 3, 4 };

		Stream.of(ar).map(a -> a + 5).forEach(System.out::println);

		Stream<Integer> stream1 = Stream.of(ar);
		stream1.map(a -> a * a).forEach(System.out::println);

	}
}
