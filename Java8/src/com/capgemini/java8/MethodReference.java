package com.capgemini.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		
		Supplier<Integer> s1=()->Integer.sum(1,2);
		System.out.println(s1.get());
		
		Supplier<Integer> s11=()->Integer.max(11,2);
		System.out.println(s11.get());

		Consumer<Integer> consumer=(a)->System.out.println(a); 
		consumer.accept(123);
		
		Consumer<Integer> consumer1=System.out::println; 
		consumer1.accept(129);
		
		Function<String,String> fn1=(a)->a.toUpperCase();
		System.out.println(fn1.apply("capgemini"));
		
		Function<String,String> fn2=String::toUpperCase;
		System.out.println(fn2.apply("capgemini"));
		
		Function<Integer,String> fn3=(a)->a.toBinaryString(a);
		Function<Integer,String> fn4=Integer::toBinaryString;
		
		System.out.println(fn4.apply(19324));
		
		
		
		
		
		
		
	}
}
