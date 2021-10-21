package com.capegemini.java8;

import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		
		String var="java is a language .we learn java language";
		
		
		Stream.of(var.split(" ")).distinct().forEach(System.out::println);
		
		String ar[]= {
"java is a language1",
"java is a language2",
"java is a language3",
"java is a language4",
"java is a language5",
"java is a language6"
		};

		Stream.of(ar).skip(3).forEach(System.out::println);
		System.out.println("limit");
		Stream.of(ar).limit(3).forEach(System.out::println);
	
		
		
	}
}
