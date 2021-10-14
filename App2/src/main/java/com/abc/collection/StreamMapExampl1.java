package com.abc.collection;

import java.util.ArrayList;
import java.util.List;

public class StreamMapExampl1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
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
		
		System.out.println(" limit of 4 ");
		list1.stream().limit(4).forEach(str->System.out.print(str+","));
		
		System.out.println(" skip of 4 ");
		
		list1.stream().skip(4).forEach(str->System.out.print(str+","));
		
		
		System.out.println("all values");
		
		list1.stream().forEach(str->System.out.print(str+","));
		System.out.println("\nlength\n");
		list1.stream().map(str->str.length()).forEach(str->System.out.print(str+","));
	}
}
