class X{
	public X() {
		super();
	System.out.println("X constructor called ");
	}
}
class Y extends X{
	public Y() {
		super();
		System.out.println("Y constructor called ");
	}
}


public class Z   extends Y {

	public Z() {
		super();
		System.out.println("Z constructor called ");
	}
	public static void main(String[] args) {
		new Z();
	}
}
