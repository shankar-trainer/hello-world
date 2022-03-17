package com.capgemini.java8.lambda;

interface Hello {
	void disp();

	void show();
}

public class AnonyMousInner {

	// Hello h=new Hello(); // error interface cannot be instantiated

	public static void main(String[] args) {
		Hello h = new Hello() {// AnonyMousInner class

			@Override
			public void disp() {
				System.out.println("disp method");
			}

			@Override
			public void show() {
				System.out.println("show method called ");
			}
		};

		h.disp();
	}
}
