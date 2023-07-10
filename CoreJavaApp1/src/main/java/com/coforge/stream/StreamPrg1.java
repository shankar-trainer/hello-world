package com.coforge.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrg1 {

	public static void main(String[] args) {
	
		Integer ar[]= {11,2,3,4,5,90,45,36};
//		Stream<Integer> of = Stream.of(1,2,3,4);
		Stream<Integer> of = Stream.of(ar);
		
		of.forEach(a->System.out.print(a+","));
		
		System.out.println("\ndisplay those divisble by 2");
		Stream.of(ar).filter(a->a%2==0).forEach(a->System.out.print(a+", "));
		
	  List<Integer> asList = Arrays.asList(new Integer[] {1,2,3,4,5});
	  System.out.println();
	  System.out.println(asList);
	  System.out.println("map of asList");
	  asList.stream().map(a->a*a).forEach(p->System.out.print(p+","));
	 
		
	}
}
