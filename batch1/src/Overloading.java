
public class Overloading {

	static void addition(int a,int b) {
		System.out.println("Addition is "+(a+b));
	}
	
	static void addition(int a,int b, int c) {
		System.out.println("Addition is "+(a+b+c));
	}
	
	static void addition(float a,float b) {
		System.out.println("Addition is "+(a+b));
	}
	
	static void addition(String a,String  b) {
		System.out.println("Full name  is "+(a+b));
	}
	
	public static void main(String[] args) {
		addition(1, 2);
		addition(10, 20,30);
		addition(10.5f,20.5f);
		addition("mahesh ", " kumar");
	}
	
	
}
