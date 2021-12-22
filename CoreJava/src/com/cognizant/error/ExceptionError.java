package com.cognizant.error;

public class ExceptionError {

	static void show() {
		//System.out.println("show method  ");
		show();//StackOverflowError
	}
	
	public static void main(String[] args) {
		show();
	}
}
