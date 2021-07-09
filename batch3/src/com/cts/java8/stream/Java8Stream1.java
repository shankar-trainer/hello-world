package com.cts.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8Stream1 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(12);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		
		Stream.of(new Integer[] {1,2,3,4,5,6,7,8,}).forEach(a->System.out.print(a+" "));
		System.out.println("stream filter divisible by 2");
		Stream.of(new Integer[] {1,2,3,4,5,6,7,8,}).filter(a->(a%2==0)).forEach(a->System.out.print(a+" "));
		
		System.out.println("map");
		
		list1.stream().forEach(a->System.out.print(a+" , "));
		System.out.println();
		list1.stream().map(a->(a*a)).forEach(a->System.out.print(a+" , "));
		System.out.println("limit \n");
		list1.stream().forEach(a->System.out.print(a+" , "));
		System.out.println();
		list1.stream().limit(3).forEach(a->System.out.print(a+" , "));
		System.out.println("\nskip\n ");
		list1.stream().skip(3).forEach(a->System.out.print(a+" , "));
	}
}
