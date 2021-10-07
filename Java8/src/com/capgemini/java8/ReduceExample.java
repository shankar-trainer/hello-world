package com.capgemini.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(a->System.out.print(a+","));
		System.out.println();
	
		Optional<Integer> reduce = Stream.of(1,2,3,4,5,6,7,8,9,10).reduce((a,b)->a+b);
		
		if(reduce.isPresent())
			System.out.println("sum is "+reduce.get());
	}
}
