package com.capgemini.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class BackedCollection1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set1=new TreeSet<>();
		set1.add(1001);
		set1.add(1002);
		set1.add(1003);
		set1.add(1004);
		set1.add(1005);
	
		System.out.println(set1);
		
		Iterator<Integer> descendingIterator = set1.descendingIterator();
		
		for(;descendingIterator.hasNext();) {
			System.out.println(descendingIterator.next());
		}
		
		NavigableSet<Integer> descendingSet = set1.descendingSet();
		
		System.out.println(descendingSet);
		System.out.println(descendingSet.first());
		System.out.println(descendingSet.last());
		System.out.println(descendingSet.ceiling(1004));
		
		SortedSet<Integer> headSet = descendingSet.headSet(1003);
		System.out.println(headSet);
		
		
		SortedSet<Integer> tailSet = descendingSet.tailSet(1003);
		System.out.println(tailSet);
		
	}
}
