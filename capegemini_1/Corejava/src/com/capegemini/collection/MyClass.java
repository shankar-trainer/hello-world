package com.capegemini.collection;

public class MyClass<A> {
	private A a;

	public MyClass(A a) {
		super();
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	public static void main(String[] args) {
		MyClass<Integer> m1=new MyClass<Integer>(20);
		MyClass<String> m2=new MyClass<>("abes");
		MyClass<Float> m3=new MyClass<Float>(567.556f);
		
		System.out.printf
		("Integer %d \nString %s\nFloat %f",m1.getA(),m2.getA(),m3.getA());
	}
}
