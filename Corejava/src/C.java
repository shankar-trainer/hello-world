class A {
	int x = 10;
}
class B extends A {
	int x = 100;
}
public class C extends B {
	int x = 1000;
	void show() {
		int x=10000;
		System.out.println("local x is " + x);
		System.out.println("instance x is " + this.x);
		System.out.println("instance x is " + super.x);
	}

	public static void main(String[] args) {
		new C().show();
	}
}
