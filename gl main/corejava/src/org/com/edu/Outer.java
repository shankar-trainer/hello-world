package org.com.edu;

class Main{
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();

	}
}

public class Outer {

	int o_x;
	String o_name="arvind kumar";

	class Inner {
		String subject="math";

		void disp() {
			System.out.println("name is " + o_name);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();

		inner.disp();
		System.out.println("subject is " + inner.subject);

	}
}
