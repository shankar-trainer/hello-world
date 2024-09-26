package com.montran.java8;

@FunctionalInterface
interface Addition {
	int sum(int a, int b);
}

@FunctionalInterface
interface Hello {
	void show();
}

public class lambdaExample {

	public static void main(String[] args) {
		Hello hello = new Hello() {
			@Override
			public void show() {
				System.out.println("hello ........");
			}
		};
		hello.show();

		Hello hello1 = () -> System.out.println("hello ----------");
		hello1.show();
		
		Addition addition=(x,y)-> x+y;
		System.out.println("Addition of 10 and 20 is "+addition.sum(10, 20));
	}
}
