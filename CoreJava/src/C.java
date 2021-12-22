class A {
	int x = 10;

	public A() {
		super();
		System.out.println("constructor A called ");
	}
}

class B extends A {
	void show() {
		System.out.println(super.x);
	}

	int x = 100; // super class variable

	public B() {
		super();
		System.out.println("constructor B called ");
	}
}

public class C extends B {
	int x = 1000; // instance variable

	public C() {
		super();
		System.out.println("constructor C called ");
	}

	void disp() {
		show();
		int x = 10000;// local variable
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		new C().disp();
	}
}
