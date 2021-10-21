package com.cts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(343);
		list1.add(34);
		list1.add(43);
		list1.add(143);
		list1.add(431);
		
		Stream<Integer> stream = list1.stream();
		
		//stream.forEach(a->System.out.println(a));
	
		System.out.println("using filter > 100  ");
		stream.filter(a->a>100).forEach(a->System.out.println(a));
		
		
	}
}
