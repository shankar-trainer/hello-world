package com.montran.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		String name[] = { "suraj kumar", "amit balyan", "kumkum", "bhavna", "amita" };
		
		Stream.of(name).forEach(a->System.out.print(a+" , "));
		
		System.out.println("using limit of 3");
		Stream.of(name).limit(3).forEach(a->System.out.print(a+" , "));
		
		System.out.println("skipping top  3");
		Stream.of(name).skip(3).forEach(a->System.out.print(a+" , "));
		
		System.out.println("names length >=6");
		Stream.of(name).filter(a->a.length()>=6).forEach(a->System.out.print(a+" , "));
		
		System.out.println("names length >=6");
		Stream.of(name).filter(a->a.length()>=6).forEach(a->System.out.print(a+" , "));
		
		System.out.println("sorted");
		Stream.of(name).sorted().forEach(a->System.out.print(a+" , "));
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(11);
		list1.add(1);
		list1.add(13);
		list1.add(12);
		list1.add(13);
		list1.add(12);
		list1.add(15);
		list1.add(1);
		list1.add(5);
		
		System.out.println("using list");
	    list1.stream().forEach(a->System.out.print(a+"  , "));
	    
	    System.out.println("using list");
	    list1.stream().map(a->a*a).forEach(a->System.out.print(a+"  , "));
	    
	    System.out.println("using distinct");
	    list1.stream().distinct().forEach(a->System.out.print(a+"  , "));

	    System.out.println("using skip");
	    list1.stream().skip(3).forEach(a->System.out.print(a+"  , "));
	    
	    System.out.println("using  limit");
	    list1.stream().limit(3).forEach(a->System.out.print(a+"  , "));
	    
	    
	}
}
