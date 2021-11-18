class X {
	int x = 10;

	public void hello() {
		System.out.println("hello in X");
	}
}

class Y extends X {
	int x = 100;

	@Override
	public void hello() {
		System.out.println("hello in Y");
		super.hello();
	}
}

public class Z extends Y {
	int x = 1000;

	@Override
	public void hello() {
		int x=1;
		System.out.println("local x is "+x);
		System.out.println("this x is "+this.x);
		System.out.println("super x is "+super.x);
		System.out.println("hello in Z");
		super.hello();
		// new X().hello();
	}

	public static void main(String[] args) {
		new Z().hello();

	}
}
