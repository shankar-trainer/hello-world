package com.cts.inner;

public class Outer1 {

	static class Inner1 {
		  // static or nested inner class
		static String country = "india";

	}

	public static void main(String[] args) {
		
		System.out.println(Outer1.Inner1.country);
	}
}


class MyOuter{
	
	public static void main(String[] args) {
		
		class Hello{
			// local inner class
		}
	}
}

