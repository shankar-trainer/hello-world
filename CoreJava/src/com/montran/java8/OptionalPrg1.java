package com.montran.java8;

import java.util.Optional;

public class OptionalPrg1 {

	public static void main(String[] args) {
		String ar[] = new String[10];
		ar[5]="hello world";
		// System.out.println(ar[5].toLowerCase());

		Optional<String> optional = Optional.ofNullable(ar[5]);
		if (optional.isPresent()) {
			System.out.println(ar[5].toUpperCase());
		     System.out.println(optional.get());
		}
		else
			System.out.println("no value present");

		String name=null;
		//String name="aryan jaiswal";
		
		System.out.println("----------------------");
		Optional<String> optional1 = Optional.ofNullable(name);
		
		System.out.println(optional1.orElse("name is null"));
		
		optional1.ifPresent(a->System.out.print(a));
		
		
		
		
	}
}
