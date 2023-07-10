package com.coforge.collection;

@FunctionalInterface
interface  Calculation{
	void addition(int a, int b);
}

@FunctionalInterface
interface  Calculation1{
	int subtraction(int a, int b);
}

public class Anonymous {

	public static void main(String[] args) {
		
		Calculation calculation=new Calculation() {
			@Override
			public void addition(int a, int b) {
			System.out.println("addition is "+(a+b));	
			}
		};
		Calculation1 calculation2=(p,q)->p-q;
		System.out.println("subtraction is "+calculation2.subtraction(11, 5));
		Calculation calculation1=(x,y)->{System.out.println("sum is " +(x+y));};
		
		calculation.addition(11, 2);
		calculation1.addition(111, 222);
	}
}
