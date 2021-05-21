
public class SumProgram {

	static void addition(int a, int b) {
		System.out.println("sum is "+(a+b));
	}
	
	static void addition(int a, int b, int c) {
		System.out.println("sum is "+(a+b));
	}
	static void addition(int a, float b) {
		System.out.println("sum is "+(a+b));
	}
	
	static void addition(float a, float b) {
		System.out.println("sum is "+(a+b));
	}
	static void addition(String a, String  b) {
		System.out.println("sum is "+(a+b));
	}
	
	public static void main(String[] args) {
		
		addition(11, 22);
		addition(11, 22.2f);
		addition(11.2f, 22.3f);
		addition(11, 22,33);
		addition("ram","kumar");
	}
	
}
