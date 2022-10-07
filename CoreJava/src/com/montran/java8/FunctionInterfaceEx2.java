package com.montran.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceEx2 {

	public static void main(String[] args) {
		Function<Double, Double> function1 = a -> Math.sqrt(a);
		Function<Double, Double> function2 = a -> a*a*a;

//		System.out.println(function1.apply(25.0f));
		
		Function<Double, Double> function3=function1.andThen(function2);
		
		System.out.println(function3.apply(25.0));
		
		
		
	}

}
