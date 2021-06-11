package com.cts.inner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(767);
		list1.add(76);
		list1.add(67);
		list1.add(7);
		list1.add(44);
		list1.add(3);
		
		list1.forEach(a->System.out.print(a+"  "));
		System.out.println("filter even no  ");
		
		list1.forEach(a->System.out.print(a+" "));

		list1.stream().filter(a->(a%2==0)).forEach(a->System.out.print(a));
		 
		
		Stream.of(1,2,3,4,5,6).forEach(p->System.out.print(p+" "));

		System.out.println("limit of 3");

		Stream.of(1,2,3,4,5,6).limit(3).forEach(p->System.out.print(p+" "));

		System.out.println("skip 2");
		
		Stream.of(1,2,3,4,5,6).skip(2).forEach(p->System.out.print(p+" "));

		System.out.println("map .....");
		
		Stream.of(1,2,3,4,5,6).map(a->a*a).forEach(p->System.out.print(p+" "));
		
		
		
		
		
	}
}
