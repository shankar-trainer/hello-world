class B {

	int a = 100;
}

public class C extends B {
	int a = 1000;

	void disp() {
		int a = 10;
		System.out.println("local  a is " + a);
		System.out.println("super a is " + super.a);
		System.out.println("this a is " + this.a);
	}

	public static void main(String[] args) {

		C c = new C();
		System.out.println(c.a);
		c.disp();
		
	}

}
