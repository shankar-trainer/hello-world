package com.capgemini.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		Stream<Integer> st1 = Stream.of(1,2,3,4,5,6,7,8);
		st1.forEach(a->System.out.print(a+","));
		
		System.out.println();
		
		Stream.of(1,2,3,4,5,6,7,8).forEach(a->System.out.print(a+","));
		System.out.println();
		Stream.of(1,2,3,4,5,2,3,6,7,8).forEach(System.out::println);
		
		System.out.println("even no");
		
		Stream.of(1,2,3,4,5,2,3,6,7,8).filter(a->(a%2==0)).forEach(System.out::println);
		
		System.out.println("without duplicate even ");
		Stream.of(1,2,3,4,5,2,3,6,7,8).distinct().filter(a->(a%2==0)).forEach(System.out::println);
		
	    List<String> citylist=new ArrayList<>();
	    citylist.add("chennai");
	    citylist.add("madurai");
	    citylist.add("ooty");
	    citylist.add("chennai");
	    citylist.add("madurai");
	    
	    citylist.forEach(System.out::println);
	    
	    System.out.println("\n cities with 7 length character");
	    citylist.stream().filter(a->a.length()==7).forEach(System.out::println);
		
	}
}
