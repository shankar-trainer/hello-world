// constructor chaining -- Z-->Y-->X
// output X, Y,Z
class X {
	public X() {
		System.out.println("constructor x called ");
	}
}

class Y extends X {

	public Y() {
		System.out.println("constructor y called ");
	}
}

public class Z extends Y {

	public Z() {
		System.out.println("constructor z called ");
	}

	public static void main(String[] args) {
		new Z();
	}
}