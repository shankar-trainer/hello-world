package edu.chitkara.collection;

public class GenericClass<E, F> {
	private E e;
	private F f;

	public GenericClass(E e, F f) {
		super();
		this.e = e;
		this.f = f;
	}


	public E getE() {
		return e;
	}

	public F getF() {
		return f;
	}

	public static void main(String[] args) {
		GenericClass<Integer, Float> class1 = new GenericClass<>(1001, 1000.0f);
		System.out.println(class1.getE());
		System.out.println(class1.getF());

	}

}
