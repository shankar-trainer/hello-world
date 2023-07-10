package com.coforge.stream;

import java.util.Optional;

public class OptionlPrg1 {

	public static void main(String[] args) {
		//Integer x=null;
		Integer x=123;
		
		Optional<Integer> optional=	Optional.ofNullable(x);
		//Optional<Integer> optional=Optional.of(x);
		
		if(optional.isEmpty())
			System.out.println("null values");
		else 
			System.out.println(optional.get());
		
		if(optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("not present ");
		
		System.out.println(optional.orElse(x));
	}
}
