package com.capgemini.java8;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {

	
	public static void main(String[] args) {
		
		Stream<Integer> st1 = Stream.of(1,2,3,4,5,6,7,8);
		
		//st1.forEach((a)->System.out.print(a+","));
		//st1.forEach(System.out::print);
		System.out.println();
		st1.forEach(System.out::println);
		//st1.forEach((a)->System.out.print(a+","));
			
//		Consumer consumer=(a)->System.out.println(a);
		Consumer consumer=System.out::println;
		consumer.accept(10);
		
	}
}
