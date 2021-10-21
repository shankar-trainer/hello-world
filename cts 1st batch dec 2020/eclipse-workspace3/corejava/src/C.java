class A{
	public A() {
		
	System.out.println("A constructor called ");
	}	
}
class B extends A {
	public B() {
		super();
		System.out.println("B constructor called ");
	}	
}

public class C  extends B{

	public C() {
		super();
		System.out.println("C constructor called ");
	}	
	
	public static void main(String[] args) {
		new C();
	}
}
