package edu.chitkara.collection;

import java.util.Arrays;
import java.util.Comparator;

class MySorting implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o2 > o1)
			return 1;
		else if (o2 < o1)
			return -1;
		else
			return 0;
	}

}

public class ArraysSort1 {
	public static void main(String[] args) {
		Integer ar1[] = { 11, 10, 3, 4, 1, 2, 15, 5 };

		System.out.println(Arrays.toString(ar1));
		Arrays.sort(ar1);
	
		System.out.println("after sorting");
		System.out.println(Arrays.toString(ar1));

		Arrays.sort(ar1,new MySorting());
		
		System.out.println("after sorting");
		System.out.println(Arrays.toString(ar1));
		
	}
}
