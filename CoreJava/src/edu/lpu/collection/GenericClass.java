package edu.lpu.collection;

public class GenericClass<A> {
	private A a;

	public GenericClass(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public static void main(String[] args) {
		GenericClass<Integer> class1 = new GenericClass<>(100);
		GenericClass<String> class2 = new GenericClass<>("hello");
		GenericClass<Float> class3 = new GenericClass<>(67000.00f);
		System.out.println(class1.getA());
		System.out.println(class2.getA());
		System.out.println(class3.getA());
	}
}
