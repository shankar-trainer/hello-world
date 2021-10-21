package com.capegemini.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		
		TreeSet  set1=new  TreeSet();
		
		set1.add(56);
		set1.add(20);
		set1.add(3);
		set1.add(99);
		
		System.out.println(set1);
		
		set1.add("hello");
		
	}
}
