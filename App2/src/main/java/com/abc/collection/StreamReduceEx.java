package com.abc.collection;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceEx {

	public static void main(String[] args) {
		
		Optional<Integer> sum = Stream.of(1,2,3,4,5,6,7,8,9,10).reduce((a,b)->a+b);
		
		if(sum.isPresent())
			System.out.println("sum is "+sum.get());
		
		
	}
}
