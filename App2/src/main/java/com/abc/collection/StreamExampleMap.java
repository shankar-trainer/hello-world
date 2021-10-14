package com.abc.collection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleMap {

	public static void main(String[] args) {

		
		
		Stream.of(1, 2, 3, 4, 5).forEach(a -> System.out.print(a + ","));

		System.out.println("\nusing map");

		Stream.of(1, 2, 3, 4, 5).map(a -> a * a).forEach(a -> System.out.print(a + ","));

		System.out.println("\nsalary of employees are \n");
		Stream.of(10000, 15000, 120000, 40000, 50000).forEach(a -> System.out.print(a + ","));
		
		System.out.println("\ngross salary of employees are \n");
		
		
		Stream.of(10000, 15000, 120000, 40000, 50000).map(a -> (a - a*5 / 100)).forEach(a -> System.out.print(a + ","));
		
		List<Integer> list1 = Stream.of(10000, 15000, 120000, 40000, 50000).map(a -> (a - a*5 / 100))
				.collect(Collectors.toList());
		
		 Set<Integer> set1 = Stream.of(10000, 15000, 120000, 40000, 50000).map(a -> (a - a*5 / 100))
				.collect(Collectors.toSet());
		 
		 
		 
		 
	}
}
