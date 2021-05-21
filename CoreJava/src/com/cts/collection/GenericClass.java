package com.cts.collection;

public class GenericClass<A,B> {

	private A a;
	private B b;


	public GenericClass(A a, B b) {
	  this.b=b;
	  this.a=a;
	}

	public void addition() {
		System.out.println(a.toString()+b.toString());
	}


	public static void main(String[] args) {
		GenericClass<String, String> class1=new GenericClass<String, String>("hello", "world");
		class1.addition();

		GenericClass<Integer, Integer> class2=new GenericClass<Integer, Integer>(1000,20);
		class2.addition();
	}
}
