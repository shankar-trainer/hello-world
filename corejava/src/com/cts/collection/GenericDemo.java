package com.cts.collection;

public class GenericDemo {

	 static <A> void     disp(A[] a) {
		for (A a2 : a) {
			System.out.print(a2+" , ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	
		Integer ar1[]= {1,2,3,4,5};
		Float  ar2[]= {1.2f,200.5f,300.5f,400.56f,500.67f};
		
		String city[]= {"delhi","chennai","hyderabad","madurai","amrabati"};
		
		disp(ar1);
		disp(ar2);
		disp(city);
		
	}
}
