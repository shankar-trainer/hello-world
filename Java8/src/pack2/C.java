package pack2;

class A {
	A() {
		System.out.println("A contructor");
	}
}

class B extends A {
	B() {
		System.out.println("B contructor");
	}
}

public class C extends B {
	C() {
		System.out.println("C contructor");
	}

	public static void main(String[] args) {
		new C();
	}
}
