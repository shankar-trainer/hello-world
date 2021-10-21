package com.capegemini.java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Test2 {

	public static void main(String[] args) {
		Function<Integer, String> square = (p) ->  "square is "+ p * p;
		
		IntFunction<Integer> if1=s-> s+s;
		IntFunction<String> if2=s->  " sum is  "+(s+s);
	
		System.out.println(square.apply(5));
		System.out.println(if1.apply(5));
		System.out.println(if2.apply(10));
				
		BiFunction<Float, Float, Float> biFunction=(a,b)->a/b;
		System.out.println("division is "+biFunction.apply(12.0f, 3.5f));
		
		
	}
}
