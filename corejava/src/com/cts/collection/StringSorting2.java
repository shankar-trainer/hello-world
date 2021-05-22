package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class MyClass implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}

public class StringSorting2 {

	public static void main(String[] args) {

		String ITComapnies[] = { "CTS", "IBM", "Polaris", "HCL", "Wipro", "CapG" };

		Arrays.sort(ITComapnies, new MyClass());

		System.out.println(Arrays.toString(ITComapnies));// ascending way

	}
}
