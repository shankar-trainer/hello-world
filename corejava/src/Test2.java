class Test {

	int x;
	int y;

	void info() {
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}
}

public class Test2 extends Test {
	int z;

	public static void main(String[] args) {
		Test2 test2 = new Test2();

		test2.x = 10;
		test2.y = 20;
		test2.z = 30;

		test2.info();

		System.out.println(test2.z);

	}

}
