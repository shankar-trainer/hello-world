package com.capgemini.java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FunctionEx1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> fn=a->a*a;
		Function<Integer, Integer> fn1=a->Integer.max(1,2);
		Function<Integer, Integer> fn2=a->Integer.sum(a,a);
		Function<Integer, String> fn3=(a)->Integer.toBinaryString(a);
		
		System.out.println(fn.apply(4));
		System.out.println(fn.apply(5));
		System.out.println(fn1.apply(5));
		System.out.println(fn3.apply(123));
		
		ToIntFunction<Integer>  toInt=(x)->Integer.min(22, 2);
		
		System.out.println(toInt.applyAsInt(null));
		
	
		BiFunction<Integer, Integer, Integer> biFunction=(a,b)->a+b;
		System.out.println(biFunction.apply(123,125));
		
		UnaryOperator<Integer> un=(a)->a+a+a;
		System.out.println(un.apply(10));
		
		
	}
}
