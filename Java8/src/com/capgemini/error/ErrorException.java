package com.capgemini.error;

public class ErrorException {

	static void hello() {
	System.out.println("hello ..");
	hello();
	//java.lang.StackOverflowError
	}
	public static void main(String[] args) {
	  hello();	
	}
}
