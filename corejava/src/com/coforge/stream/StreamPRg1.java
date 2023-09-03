package com.coforge.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPRg1 {

	public static void main(String[] args) {
		Integer ar[]= {11,2,3,4,1,55,7,8,5,9,10};
		
		Stream.of(ar).forEach(a->System.out.print(a+","));
		
		List<Integer> list1=new ArrayList<>();
		list1.add(1001);
		list1.add(108);
		list1.add(10);
		list1.add(900);
		
		System.out.println();
		list1.stream().forEach(a->System.out.print(a+","));
		System.out.println("\n even no \n");
		list1.stream().filter(a->a%2==0).forEach(a->System.out.print(a+","));
	
		Integer ar1[]= {1,2,3,4,5};
		System.out.println("using map");
		
		Stream.of(ar1).forEach(a->System.out.print(a+","));
		System.out.println();
		Stream.of(ar1).map(a->a*a).forEach(a->System.out.print(a+","));
		System.out.println("\nusing map and filter\n");
		
		Stream.of(ar1).map(a->a*a).filter(a->a>10).forEach(a->System.out.print(a+","));
		
	
		
		
		
	}
	
}
