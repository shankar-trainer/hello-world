package com.cts.collection;

import java.util.List;
import java.util.ArrayList;

public class ListProgram1 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		
		list1.add("hello");
		list1.add("welcome");
		list1.add("good morning");

		System.out.println(list1);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("  using for each ");
		
		for (String string : list1) {
			System.out.println(string);
		}
		
	}
}
