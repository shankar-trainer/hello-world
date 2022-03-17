package com.capgemini.java8.lambda;

public class Outer {
 int x=10;
	//private 
	//protected
	
	class Inner {
		public Inner() {
		}
		int y=1000;
	   void disp() {
		   System.out.println(x);//inner class can access the member of outer class 
	   } 
	 }
	
	void show() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Outer outer=new  Outer();
		Outer.Inner inner=outer.new Inner();
		inner.disp();
		System.out.println(inner.y);
	}
}
