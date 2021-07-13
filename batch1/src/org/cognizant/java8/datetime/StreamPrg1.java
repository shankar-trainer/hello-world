package org.cognizant.java8.datetime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrg1 {

	public static void main(String[] args) {
		Integer ar[] = { 1, 2, 3, 4, 5, 6 };
		Stream.of(ar).forEach(a -> System.out.println(a));

		System.out.println("using filter to diaplay even no ");
		Stream.of(ar).filter(a -> (a % 2 == 0)).forEach(a -> System.out.print(a + "  "));

		System.out.println("using map  ");

		Stream.of(ar).forEach(a -> System.out.print(a + "  "));
		System.out.println();
		Stream.of(ar).map(a -> (a * a)).forEach(a -> System.out.print(a + "  "));
		System.out.println("limit 3 values");
		Stream.of(ar).limit(3).forEach(a -> System.out.print(a + "  "));
		
		System.out.println("skip 3 values");
		Stream.of(ar).skip(3).forEach(a -> System.out.print(a + "  "));

		List<String> list1 = new ArrayList<>();

		list1.add("java 8 lambda ");
		list1.add("python  lambda ");
		list1.add("javascript arrow  ");
		System.out.println();
		list1.stream().forEach(a -> System.out.print(a + " "));

	}
}
