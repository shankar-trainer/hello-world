class A {
	public A() {
		super();
		System.out.println("A class constructor");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("B class constructor");
	}
}

public class C extends B {
	public C() {
		super();
		System.out.println("C class constructor");
	}

	public static void main(String[] args) {
		// new C();
		C c = new C();
	}
}
