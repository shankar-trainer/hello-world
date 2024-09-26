package com.montran.java8;

import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class FunctionInterfaceEx1 {

	public static void main(String[] args) {
		Function<Integer, Integer> i=a->a*a;
		
		System.out.println(i.apply(10));
		
		IntFunction<Integer> j=a->a+a;
		System.out.println(j.apply(20));
		
		Function<Integer, String> k=a->a+" no1";
		System.out.println(k.apply(100));
		
		ToIntFunction<Integer> l=a->Integer.sum(a, a);
		System.out.println(l.applyAsInt(30));
		
		DoubleToLongFunction doubleToLongFunction;
		
	}
}
