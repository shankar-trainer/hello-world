package com.capegemini.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo3 {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<Integer>();

		set1.add(888);
		set1.add(88);
		set1.add(788);
		set1.add(288);
		set1.add(183);
		set1.add(488);
		System.out.println(set1);

		NavigableSet<Integer> set3 = set1.descendingSet();
		System.out.println(set3);
		Set<Integer> set2 = set3.headSet(183);
		System.out.println(set2);
		
		set3.lower(200);
		set3.higher(200);
		

	}
}
