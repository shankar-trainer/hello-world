package com.cts.inner;

public class Outer {
int x=100;
	private  class inner {
		int y=200;
		void method() {
			System.out.println("inner class"+x);
		}
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		System.out.println(outer.x);
		
		Outer.inner in=outer. new inner();
		
		System.out.println(in.y);
		in.method();
		
	}
}
