package com.capgemini.collection;

public class GenericMethod {

	
	public static  <A>  void disp(A[] a) {
		for(A a1:a)
			System.out.println(a1);
	}
	
	public static void main(String[] args) {
		disp(new Integer[] {1,2,3,4,5});
		disp(new String[] {"delhi","chennai","madurai"});
		
	}
}
