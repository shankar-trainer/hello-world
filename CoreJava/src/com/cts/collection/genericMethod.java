package com.cts.collection;

public class genericMethod {

	public static <A> void  getValues(A[] a){
		System.out.println();
		
		for (A a2 : a) {
			System.out.print(a2);
			System.out.print("  ");
		}
	}
	
	
	public static void main(String[] args) {
		
		Integer ar[]= {1,2,3,4};
		Character ar1[]= {'a','b','c','d','e'};
		getValues(ar);
		getValues(ar1);

		getValues(new Float[] {11.2f,22.3f,55.4f,66.9f});
	}
}
