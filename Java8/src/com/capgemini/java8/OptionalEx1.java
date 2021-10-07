package com.capgemini.java8;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {

//		String name = null;
		String name ="anand kumar";

		Optional<String> optional = Optional.ofNullable(name);

		if (optional.isPresent())
			System.out.println(name);
		else
			System.out.println("name is null");

		System.out.println("using optional orElse");
		System.out.println(optional.orElse("name is  null"));

System.out.println();		
		
	}
}
