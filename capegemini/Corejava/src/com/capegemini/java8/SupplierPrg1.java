package com.capegemini.java8;

import java.util.function.Supplier;

public class SupplierPrg1 {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier="hello world"::length;
		Supplier<Integer> supplier2=()->"hello world".length();
		
		System.out.println(supplier2.get());
		
		System.out.println(supplier.get());
		
		Supplier<String> supplier1="hello world"::toUpperCase;

		System.out.println(supplier1.get());
		
	}
}
