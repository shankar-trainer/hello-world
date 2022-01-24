public class Addition {
	public void add(int a, int b) {
		System.out.println("sum is " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("sum is " + (a + b + c));
	}

	public void add(String a, String b) {
		System.out.println(a + b);
	}

	public void add(float a, float b) {
		System.out.println("sum is " + (a + b));
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add("hello ", " world");
		addition.add(1, 2);
		addition.add(1987f, 123.45f);

	}

}
