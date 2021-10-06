package com.capgemini.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamExample3 {

	public static void main(String[] args) {
		List<String> citylist = new ArrayList<>();
		citylist.add("chennai");
		citylist.add("madurai");
		citylist.add("ooty");
		citylist.add("chennai");
		citylist.add("madurai");
		citylist.add("noida");
		citylist.add("delhi");
		citylist.add("kolkotta");
		citylist.add("delhi");

		System.out.println("non duplicate  only 4 elements ");
		citylist.stream().distinct().limit(4).forEach(a -> System.out.print(a + ",  "));
		
		
		System.out.println("non duplicate  only 4 elements ");
		citylist.stream().distinct().forEach(a -> System.out.print(a + ",  "));
		
		
		
		System.out.println("\nnon duplicated");
		citylist.stream().distinct().forEach(a -> System.out.print(a + "  "));
		System.out.println("sorted");
		
		citylist.stream().sorted().forEach(a -> System.out.print(a + "  "));
		System.out.println("non duplicate sorted  with length 5 char");
		
		citylist.stream().distinct().sorted().filter(a->a.length()==5).forEach(a -> System.out.print(a + "  "));
		
		System.out.println("no of elements "+	citylist.stream().count());
		
		System.out.println("limit ");
		
		citylist.stream().distinct().sorted().filter(a->a.length()==5).limit(4).forEach(a -> System.out.print(a + "  "));
		


	}
}
