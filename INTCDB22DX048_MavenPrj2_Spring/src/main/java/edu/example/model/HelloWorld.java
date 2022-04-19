package edu.example.model;

public class HelloWorld {

	public void welcome() {
		System.out.println("welcome to spring ....");
	}
	
	public  int getFactorial(int f) {
		int fact = 1;
		for (int i = 1; i <= f; i++) {
			fact = fact * i;

		}
		return fact;
	}
	
}
