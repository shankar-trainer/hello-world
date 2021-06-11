class A1 {
	int a = 100;
}

class B extends A1 {
	int a = 1000;

	void disp() {
		System.out.println("inside B " + super.a);
	}
}

class A12 extends B {
	int a = 10000;

	void disp() {
		super.disp();
		System.out.println("inside A12");

		System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		new A12().disp();
	}
}
