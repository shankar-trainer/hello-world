package corejava;

public class OverLoading {
	static void addition(int a, int b) {
		System.out.println("sum of two int is " + (a + b));
	}
	static void addition(int a, int b, int  c) {
		System.out.println("sum is " + (a + b+c));
	}
	static void addition(float a,float b) {
		System.out.println("sum of two decimal  " + (a + b));
	}
	static void addition(String a, String b) {
		System.out.println("full name  is " + (a + b));
	}

	public static void main(String[] args) {
		addition(12.4f, 33.4f);
		addition(12, 33);
		addition(1,2,3);
		addition("Rajeev ", " Kumar");
	}
}
