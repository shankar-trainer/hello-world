package com.capgemini.java8.lambda;

public class Outer1 {

	static class inner{
		static int x=100;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Outer1.inner.x);
	}
	
	void show() {
		class LocalClass{// Local Inner class, accessed inside method only 
			
		}
	}
}
