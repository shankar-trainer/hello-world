package com.nec.collection;

public class Test9 {
	public static void main(String[] args) {
		int ar[] = { 11, 2, 3, 4, 55, 66, 7 };

		for (int i = 0; i < ar.length; i++) {
		}
		
		int sum = 0;
		for (int i : ar) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("total is " + sum);
	}
}
