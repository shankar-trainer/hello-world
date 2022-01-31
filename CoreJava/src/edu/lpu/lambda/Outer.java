package edu.lpu.lambda;

public class Outer {

	int t = 10;

	void disp() {
		System.out.println(" t is " + t);
	}

	private class Inner {
		int z = 100;

		void show() {
			// inner class method can acces outer class member , vice versa is not true
			System.out.println(z + "   outer t " + t);
		}
	}

	public static void main(String[] args) {

		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();
		inner.show();
	}
}
