package com.capegemini.collection;

public class GenericDemo {

	static <A> void display(A arr[]){
		System.out.println();
		for (A a : arr) {
		System.out.print(a+"  ");	
		}
	}
	
	public static void main(String[] args) {
		
		display(new Integer[]{1,2,3,4});
		display(new Float[]{123.45f,67.85f,794.667f,778.66f});
		display(new String[]{"ram kumar","mohan kumar","sharad kumar","abhay kumar"});
	}
	
	
}
