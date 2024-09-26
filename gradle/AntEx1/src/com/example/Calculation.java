package com.example;

public class Calculation {

	static int addition(int a,int b) {
		return a+b;
	}
	
	static int subtraction(int a,int b) {
		return a-b;
	}
	
	static int multiplication(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int x=10,y=5;
		System.out.printf("\nsum of %d and %d is %d  ",x,y,addition(x, y));
		System.out.printf("\nsubtraction of %d and %d is %d  ",x,y,subtraction(x, y));
		System.out.printf("\nmultiplication of %d and %d is %d  ",x,y,multiplication(x, y));
	}
}
