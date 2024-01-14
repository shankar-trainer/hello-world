package edu.coforge.java8;

public class Outer {
 int y=100;
	class Inner{
		int id=787;
		void hello() {
			System.out.println("outer y "+y);
		}
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=new Outer().new Inner();
		System.out.println(inner.id);
		inner.hello();
	}
}
