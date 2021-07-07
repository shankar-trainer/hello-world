class B {
	int x = 200;
}

public class C extends B {
	int x = 20;

	void disp() {
		int x = 2;
		System.out.println("inside disp local x " + x);
		System.out.println("instance x" + this.x);
		System.out.println("super  x" + super.x);
	}

	public static void main(String[] args) {
		new C().disp();
	}
}
