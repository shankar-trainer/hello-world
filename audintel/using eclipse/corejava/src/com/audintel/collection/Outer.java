package com.audintel.collection;

public class Outer {
	int x = 100;

	void show() {
		System.out.println(new Inner().y);
	}
	
	private class Inner {
		int y = 900;

		void disp() {
			System.out.println(y);
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();
		System.out.println(outer.x);
		inner.disp();
	}

}
