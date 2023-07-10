package com.coforge.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrg2 {

	public static void main(String[] args) {
		Integer ar[]= {11,2,3,4,5,34,45,36,11,4,5};
		 
		// distinct removes duplicate
		System.out.println("duplicate removed \n");
		Stream.of(ar).distinct().forEach(p->System.out.print(p+","));
	
		System.out.println("\nsorted ");
		Stream.of(ar).sorted().forEach(p->System.out.print(p+","));

		System.out.println("\nlimit\n ");
		Stream.of(ar).limit(4).forEach(p->System.out.print(p+","));
		
		System.out.println("\nsorted filter \n");
		Stream.of(ar).sorted().filter(a->(a>10)).forEach(p->System.out.print(p+","));
		
		Stream.of(ar).skip(4).forEach(p->System.out.print(p+","));
		
		List<Integer> collect = Stream.of(ar).sorted().
				 collect(Collectors.toList());
		
		Set<Integer> collect2 = Stream.of(ar).sorted().
				collect(Collectors.toSet());
		
		
	
	}
}
