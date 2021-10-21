package com.capegemini.java8;

import java.util.function.ToIntFunction;

public class MethodReferenece {

	public static void main(String[] args) {
		
		String s="leraning java";
		
		ToIntFunction<String>  function=p->p.length();
		int length=function.applyAsInt(s);
		System.out.println(length);
				
		ToIntFunction<String>  function1=String::length;
		System.out.println(function1.applyAsInt(s));
		
		
		
		
	}
}
