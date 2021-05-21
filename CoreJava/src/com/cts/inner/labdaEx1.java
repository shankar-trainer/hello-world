package com.cts.inner;

interface Addition {
	int add(int a, int b);
}

@FunctionalInterface
interface Subtraction {
	void sub(int a, int b);
}

public class labdaEx1 {

	public static void main(String[] args) {

		Addition addition = new Addition() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		System.out.println(addition.add(11, 22));

		Addition addition2 = (x, y) -> x + y;
		System.out.println(addition2.add(11, 22));
		Addition addition3 = (x, y) -> {
			return x + y;
		};
		System.out.println(addition3.add(11, 22));

		Subtraction subtraction = (p, q) -> {
			System.out.println("subtraction is " + (p - q));
		};

		subtraction.sub(22, 3);

	}
}
