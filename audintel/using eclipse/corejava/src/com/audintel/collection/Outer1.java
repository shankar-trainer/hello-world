package com.audintel.collection;

public class Outer1 {

	static  class Hello{
		 static int x=90909;
		 static void dispaly() {
			 System.out.println("  this is inner display ");
		 }
	}
	
	public static void main(String[] args) {
		Outer1.Hello.dispaly();
	}
}
