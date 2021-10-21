package corejava;

class A {
	public A() {
		System.out.println("constructor A called");
	}
}

class B extends A {
	public B() {
		System.out.println("constructor B called");
	}
}

public class C extends B {

	public C() {
		System.out.println("constructor C called");
		//super();
	}

	public static void main(String[] args) {
		new C();
	}
}
