package com.capgemini.java8;

public class lambdaExample2 {

	interface addition {
		void sum(int a, int b);
	}

	interface subtraction {
		int sub(int a, int b);
	}
	


	public static void main(String[] args) {
		addition add1 = (j, k) -> {
			System.out.println("sum is " + (j + k));
		};

		subtraction sub1 = (p, q) -> {
			return p - q;
		};
		subtraction sub2 = (p, q) -> p - q;

		add1.sum(11, 22);
		int sub = sub1.sub(11, 2);
		System.out.println("subtraction is " + sub);
		System.out.println("subtraction is " + sub2.sub(11, 9));

	}
}
