package com.coforge.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPrg2 {

	public static void main(String[] args) {
		Integer ar[] = { 11, 2, 3, 4, 1, 55, 2, 11, 7, 8, 5, 9, 10, 8 };

		List<Integer> asList = Arrays.asList(ar);

		// asList.forEach(System.out::println);

		System.out.println(asList.stream().sorted().distinct().count());

		// asList.stream().sorted().distinct().limit(5).forEach(System.out::println);
		asList.stream().sorted().distinct().limit(5).forEach(System.out::println);
		System.out.println("skip 8 elements ");

		asList.stream().sorted().distinct().skip(8).forEach(System.out::println);

		List<Integer> collect = asList.stream().sorted().distinct().skip(8).collect(Collectors.toList());
		Set<Integer> collect2 = asList.stream().sorted().distinct().skip(8).collect(Collectors.toSet());
		
		System.out.println(collect);
		System.out.println(collect2);

		System.out.println(asList);

	}
}
