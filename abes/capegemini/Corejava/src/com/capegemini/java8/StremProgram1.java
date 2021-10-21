package com.capegemini.java8;

import java.util.stream.Stream;

public class StremProgram1 {

	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);

		stream1.forEach(a -> System.out.print(a + "  "));

		System.out.println();

		Stream<String> stream2 = Stream.of("java", "python", "perl");
		stream2.forEach(System.out::println);
		}
}
