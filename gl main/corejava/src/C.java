class A {

	public A() {
		super();
		System.out.println("constructor A");
	}
}

class B extends A {

	public B() {
		super();
		System.out.println("constructor B");
	}
}

public class C extends B {

	public C() {
		super();
		System.out.println("constructor C");
	}
public static void main(String[] args) {
	new C();
}
}
