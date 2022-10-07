package com.montran.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class MethodReference {

	public static void main(String[] args) {

		Integer ar[]={11,2,3,1,44,5};
		
		Arrays.sort(ar,Integer::compareTo);
		
		System.out.println(Arrays.toString(ar));
		
		Function<String, String> function1=a->a.toUpperCase();
		
		Function<String, String> function2=String::toUpperCase;
		
		System.out.println(function2.apply("hello to java"));
		
		
		Stream.of(ar).forEach(a->System.out.print(a+" ,  "));
		System.out.println("using method reference");
		
		Stream.of(ar).forEach(System.out::println );
		
//		Function<Integer, String> function3=a->Integer.toBinaryString(a);
		Function<Integer, String> function3=Integer::toBinaryString;
		
		System.out.println(function3.apply(123));
		
		
		
	}
}
