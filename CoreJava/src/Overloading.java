
public class Overloading {

	
	static  void addition(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
	
	static  void addition(int a, int b, int c) {
		System.out.println("Addition is "+(a+b+c));
	}
	
	static  void addition(float a, float b) {
		System.out.println("Addition is "+(a+b));
	}
	
	static  void addition(String  a,String b) {
		System.out.println("Addition is "+(a+b));
	}
	
	
	public static void main(String[] args) {
		addition(11,22);
		addition(11.5f,22.6f);
		addition(1,2,3);
		
		addition("hello", "world");
	}
	
}
