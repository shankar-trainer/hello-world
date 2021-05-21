package com.cts.inner;

public class MyOuter {
	int a = 100;

	private class Inner {
		int b = 99;

		void disp() {
			System.out.println("outer " + a);
		}
	}

	public static void main(String[] args) {

		MyOuter myOuter = new MyOuter();
		MyOuter.Inner inner = myOuter.new Inner();

		System.out.println(inner.b);

		inner.disp();

	}
}
