package com.nec.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
public static void main(String[] args) {
	Set<Integer> set1=new LinkedHashSet<>();//ordered 
			//TreeSet<>();//sorted 
			//HashSet<>();// not ordered
	set1.add(100);
	set1.add(99);
	set1.add(102);
	set1.add(101);
	System.out.println(set1);
	
}
}
