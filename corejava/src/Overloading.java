
public class Overloading {

	public static void addition(int a, int b) {
		System.out.println("addition is " + (a + b));
	}

	public static void addition(int a, int b, int c) {
		System.out.println("addition is " + (a + b+c));
	}

	public static void addition(float a, float b) {
		System.out.println("addition is " + (a + b));
	}

	public static void main(String[] args) {
     addition(11.2f, 22.3f);
     addition(11, 2);
     addition(11, 2,3);
	}

}
