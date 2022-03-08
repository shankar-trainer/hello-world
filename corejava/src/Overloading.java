
public class Overloading {

	static void addition(int a ,int b) {
		System.out.println("addition is "+(a+b));
	}
	
	static void addition(int a ,int b, int c) {
		System.out.println("addition is "+(a+b));
	}
	static void addition(float a ,float b) {
		System.out.println("addition is "+(a+b));
	}
	static void addition(String a ,String b) {
		System.out.println("name  is "+(a+b));
	}
	
	public static void main(String[] args) {
		addition(11.3f,33.4f);
		addition(11,33);
		addition(11,33,22);
		addition("ram","kumar");
		
	}
}
