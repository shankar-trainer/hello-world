package edu.chitkara.collection;

import java.util.Arrays;
import java.util.Comparator;

class Comparator1 implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class ComparatorExampl1 {
	public static void main(String[] args) {
		String ar[] = { "suresh", "amrapali", "vinita", "shilpa", "kavia" };
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar,new Comparator1());
		System.out.println(Arrays.toString(ar));

	}
}
