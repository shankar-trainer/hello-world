package com.abc.collection;

import java.util.Arrays;
import java.util.Comparator;

class NameSortingInReverse implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class ArraysReverseSort {

	public static void main(String[] args) {
		String names[] = { "suman kumar", "babau lal", "preetam kumar", "jayant kumar", "subodh sharma",
				"tarak mehta" };

		System.out.println("Unsorted Names :\n\t" + Arrays.toString(names));

		Arrays.sort(names);

		System.out.println("Sorted Names :\n\t" + Arrays.toString(names));

		Arrays.sort(names, new NameSortingInReverse());

		System.out.println("Sorted Names In Reverse Order :\n\t" + Arrays.toString(names));
	}
}
