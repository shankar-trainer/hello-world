class A{
	public A() {
		super();
	 System.out.println("a constructor called");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("b constructor called");
	}
}

public class C  extends B{
	public C() {
		super();
		System.out.println("c constructor called");
	}

	public static void main(String[] args) {
		new C();
	}
}
