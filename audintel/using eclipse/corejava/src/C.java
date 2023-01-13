class A {
	public A() {
		super();
		System.out.println("A  Constructor called ");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("B  Constructor called ");
	}
}

public class C extends B {
	public C() {
		super();
		System.out.println("C  Constructor called ");
	}

	public static void main(String[] args) {
		new C();
	}
}
