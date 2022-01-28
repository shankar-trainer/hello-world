package edu.lpu.java8;

public class Outer {
	int x;
	String name;

	class Inner {
		int y = 10;

		void disp() {
			System.out.println("x is " + x);
		}
	}

	public static void main(String[] args) {
   
		Outer outer=new Outer();
       
		//Inner inner=new Inner();
		Inner inner=outer.new Inner();
		
		inner.disp();
		System.out.println("y is "+inner.y);
	}
}
