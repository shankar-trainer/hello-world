
public class OverLoading {

	static void addition(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
	
	static void addition(int a, int b, int c) {
		System.out.println("Addition is "+(a+b+c));
	}
	static void addition(float a, float b) {
		System.out.println("Addition is "+(a+b));
	}
	static void addition(String a, String b) {
		System.out.println("Addition is "+(a+b));
	}
	
	public static void main(String[] args) {
		addition(1, 2);
		addition("hello","world");
		addition(22.3f,67.8f);
		addition(1, 2,3);
		
	}
}
