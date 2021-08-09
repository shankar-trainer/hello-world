class B {
	int x = 10;// super class variable for class C
}

public class C extends B {
	int x = 100; // instance variable

	void disp() {
		int x = 1000;// local variable
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		new C().disp();
	}
}
