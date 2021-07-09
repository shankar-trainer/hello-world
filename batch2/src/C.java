class B {
	int x = 1000;
	void show() {
		System.out.println("show in super class");
	}
}

public class C extends B {
	@Override
	void show() {
		System.out.println("show in sub class");
	}

	int x = 100;
	void disp() {
		int x = 10;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		super.show();
	}

	public static void main(String[] args) {
		new C().disp();
		new C().show();
	}
}
