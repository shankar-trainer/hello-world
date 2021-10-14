package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("php");
		list1.add("java");
		list1.add("python");
		list1.add("nodejs");
		list1.add("javascript");
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
	}
}
