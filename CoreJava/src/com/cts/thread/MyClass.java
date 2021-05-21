package com.cts.thread;

public class MyClass {

	/**
	 * 
	 * disp method is used to display information
	 * 
	 * @param a String parameter
	 */

	@Deprecated
	void disp(String a) {
		System.out.println("hello " + a);
	}

	public static void main(String[] args) {
		new MyClass().disp("hello ");
	}

}
