
public class Outer1 {
	int x = 100;

	void disp() {
		Inner1 inner1 = new Inner1(20);
		System.out.println(inner1.y);
	}

	private class Inner1 {
		int y;

		public Inner1(int y) {
			super();
			this.y = y;
		}

		void show() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.disp();

		// Inner1 inner1 = new Inner1(20);
		Inner1 inner1 = outer1.new Inner1(50);
		System.out.println(inner1.y);
		inner1.show();
	}
}
