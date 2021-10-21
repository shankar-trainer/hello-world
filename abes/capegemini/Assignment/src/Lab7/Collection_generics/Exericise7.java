package Lab7.Collection_generics;

import java.util.Arrays;

public class Exericise7 {

	static int[] getSorted(int ar[]) {
		int ar3[] = new int[ar.length];

		int p = 00;

		for (Integer i : ar) {
			String s = new String(i.toString());
			String k = new StringBuffer(s).reverse().toString();
			ar3[p++] = Integer.parseInt(k);
		}
		Arrays.sort(ar3);
		return ar3;
	}

	public static void main(String[] args) {

		System.out.println("after sorting");
		int arr1[] = getSorted((new int[] { 123,45,67 }));

		System.out.println(Arrays.toString(arr1));

	}
}
