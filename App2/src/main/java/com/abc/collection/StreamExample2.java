package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("capgemini");
		list1.add("HCL");
		list1.add("techmahindra");
		list1.add("capgemini");
		list1.add("global logic");
		list1.add("inspop");
		list1.add("techmahindra");
		list1.add("hexaware");
		list1.add("cognizant");
		list1.add("inspop");

		System.out.println(list1.stream().count());
		
		System.out.println("sorted ascending order");
		list1.stream().sorted().forEach(a->System.out.print(a+","));
		
		//list1.parallelStream().sorted().forEach(a->System.out.print(a+","));
		
		
		
		Comparator<String> comp1=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		System.out.println("sorted descending order");
		list1.stream().sorted(comp1).forEach(a->System.out.print(a+","));
		
		
		System.out.println("\nafter duplicate removal");
		list1.stream().distinct().forEach(a->System.out.print(a+","));
		
		
	}
}
