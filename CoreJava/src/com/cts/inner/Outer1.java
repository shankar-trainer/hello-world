package com.cts.inner;

public class Outer1 {
	int p = 99;
	static int y = 100;

	static class inner {// static inner or nested class
		static String country = "india";

		void disp() {
			System.out.println(new Outer1().p);
			System.out.println(y);
		}

	}

	public static void main(String[] args) {
		System.out.println(Outer1.inner.country);
	}
}
