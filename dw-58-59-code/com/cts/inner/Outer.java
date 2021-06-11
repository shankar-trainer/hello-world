package com.cts.inner;

public class Outer {
	int x = 100;

	// private
	public class inner {

		void disp() {
			System.out.println("inner disp");
		}
	}

	public static void main(String[] args) {
		System.out.println(new Outer().x);

	}
}
