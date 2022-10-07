package com.montran.java8;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst {

	public static void main(String[] args) {
		
		String name[] = { "suraj kumar", "amit balyan", "kumkum", "bhavna", "amita", "suraj kumar", "amita"};
		
		Stream.of(name).forEach(a->System.out.print(a+" , "));
		System.out.println();
		
		Optional<String> findFirst = Stream.of(name).findFirst();
		System.out.println(findFirst.orElse("not present"));
		
		Optional<String> findAny = Stream.of(name).findAny();
		System.out.println(findAny.orElse("not present"));
		
		List<String> collect = Stream.of(name).collect(Collectors.toList());
		Set<String> set1 = Stream.of(name).collect(Collectors.toSet());
		
		System.out.println(collect);
		System.out.println(set1);
		
		
	}
}
