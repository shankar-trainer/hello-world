package com.capgemini.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class BackedCollection {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("pizza");
		set.add("burger");
		set.add("manchurian");
		set.add("biryani");
		set.add("pasta");
		set.add("chowmein");
		set.add("momos");

		System.out.println(set);

		Iterator<String> descendingIterator = set.descendingIterator();

		// for (; descendingIterator.hasNext();)
		while (descendingIterator.hasNext())
			System.out.print(descendingIterator.next() + " , ");

		NavigableSet<String> set1 = set.descendingSet();

		System.out.println("\nlower " + set1.lower("momos"));
		System.out.println("\nhigher " + set1.higher("momos"));
		System.out.println("\nceiling " + set1.ceiling("momos"));

		System.out.println("\nfloor " + set1.floor("momos"));

		System.out.println("\nlast " + set1.last());
		System.out.println("\nfirst  " + set1.first());
		SortedSet<String> headSet = set1.headSet("momos");
		System.out.println("\n head set " + headSet);

		SortedSet<String> tailSet = set1.tailSet("momos");
		System.out.println("\n tail set " + tailSet);
	}
}
