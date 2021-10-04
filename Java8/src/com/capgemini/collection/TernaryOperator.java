package com.capgemini.collection;

public class TernaryOperator {

	public static void main(String[] args) {

		int x = 199;
		/*if (x % 2 == 0)
			System.out.println("even no");
		else
			System.out.println("odd no");
       */
		
		String s = (x % 2 == 0 ? "evenno" : "oddno");
		System.out.println(s);

		System.out.println((x % 2 == 0 ? "even no" : "odd no"));

	}
}
