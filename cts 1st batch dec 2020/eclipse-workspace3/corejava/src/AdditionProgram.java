
public class AdditionProgram {

	static int sum(int a, int b) {
		return a + b;
	}

	static float sum(float a, float b) {
		return a + b;
	}

	static String sum(String a, String b) {
		return a + b;
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		System.out.println(sum(1, 2));
		System.out.println(sum("one", "two"));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(11.2f, 2.2f));

	}
}
