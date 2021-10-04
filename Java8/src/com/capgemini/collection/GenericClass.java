package com.capgemini.collection;

public class GenericClass<A> {
	private A a;

	public GenericClass(A a) {
		super();
		this.a = a;
	}

	public GenericClass() {
	}

	void print(A a) {
		System.out.println(a);
	}

	void print1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		GenericClass<String> class1 = new GenericClass<>();
		GenericClass<Integer> class2 = new GenericClass<>();
		GenericClass<Float> class3 = new GenericClass<>();

		class1.a = "hello";
		class1.print(class1.a);

		class2.a = 56556567;
		class2.print(class2.a);

		class3.a = 6777676.677f;
		class3.print(class3.a);

		GenericClass<String> class11 = new GenericClass<>("hello");
		GenericClass<Integer> class22 = new GenericClass<>(12345);
		GenericClass<Float> class33 = new GenericClass<>(878877.00f);

		class11.print1();
		class22.print1();
		class33.print1();
	}

}
