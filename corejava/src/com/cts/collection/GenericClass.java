package com.cts.collection;

public class GenericClass<A> {

	private A a;

	public GenericClass(A a) {
		this.a = a;
	}

	A getValue() {
		return a;
	}

	@Override
	public String toString() {
		return "GenericClass [a=" + a + "]";
	}

	
	public static void main(String[] args) {
	  GenericClass<Integer> class1=new GenericClass<Integer>(10000);
	  GenericClass<String> class2=new GenericClass<>("hello ");
	  GenericClass<Character> class3=new GenericClass<>('a');
	  GenericClass<Float> class4=new GenericClass<>(45445.56f);
	  
	  System.out.println(class1.getValue());
	  System.out.println(class2.getValue());
	  System.out.println(class3.getValue());
	  System.out.println(class4.getValue());
	  System.out.println(class4);
	}
}
