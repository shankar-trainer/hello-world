package edu.chitkara.collection;

public class GenericMethod {
	static   <A> void display(A[] a){
		 for (A a2 : a) 
			System.out.print(a2+", ");
		 System.out.println();
	}	
	
	public static void main(String[] args) {
		Integer ar1[]= {1,2,3,4,5};
		Character grade[]={'A','B','C','D','E'};
		Float f[]= {10000.45f,34000.56f,90000.0f,45000.65f};
		String s[]={"delhi","chennai","ranchi","bhagalpur"};
		display(ar1);
		display(grade);
		display(s);
		display(f);
	}
	
}
