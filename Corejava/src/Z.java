class X {
	public X() {
		System.out.println("constructor X called");
	}
}
class Y extends X {
	public Y() {
		System.out.println("constructor Y called");
	}
}
public class Z extends Y {
	public Z() {
		System.out.println("constructor Z called");
	}

	public static void main(String[] args) {
		new Z();
	}

}
