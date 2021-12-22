package com.cognizant.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemoval {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 1, 6, 7, 8, 3, 4 };

		Set<Integer> set1 = new TreeSet<>();// HashSet<>();

		for (int i = 0; i < ar.length; i++) {
			set1.add(ar[i]);
		}
		System.out.println("duplicate removed and sorted set");
		System.out.println(set1);

		System.out.println("frequency of each of the elements ");

		ArrayList<Integer> list1 = new ArrayList<>();

		for (Integer integer : ar) {
			list1.add(integer);
		}

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + "----" + Collections.frequency(list1, list1.get(i)));
		}

	}
}
