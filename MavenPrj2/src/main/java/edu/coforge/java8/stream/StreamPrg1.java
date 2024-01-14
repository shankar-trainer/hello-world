package edu.coforge.java8.stream;

import java.util.stream.Stream;

public class StreamPrg1 {

	public static void main(String[] args) {
		Integer ar[] = { 11, 2, 3, 4, 12, 6, 45 };

		// using array Stream.of() 
		Stream<Integer> stream = Stream.of(ar);
		stream.forEach(a -> System.out.print(a + ","));

		System.out.println();
		Stream.of(ar).forEach(a -> System.out.print(a + ",  "));

		System.out.println("using filter \n");

		Stream.of(ar).filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + ",  "));

		System.out.println("using filter and sorting \n");

		Stream.of(ar).filter(a -> a % 2 == 0).sorted().forEach(a -> System.out.print(a + ",  "));
	
		System.out.println("\n");
		Stream.of(ar).forEach(a -> System.out.print(a + ",  "));
		System.out.println("\n");
		Stream.of(ar).map(a->a*a).forEach(a -> System.out.print(a + ",  "));
		
		
	}
}
