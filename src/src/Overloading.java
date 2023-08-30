public class Overloading {

	static  void  addition(int a, int b) {
		System.out.println("Addition of 2 int is "+(a+b));
	}
	
	static  void  addition(int a, int b, int c) {
		System.out.println("Addition of 3 int is "+(a+b));
	}
	
	static  void  addition(float a, float b) {
		System.out.println("Addition  of float is "+(a+b));
	}
	
	static  void  addition(String  a, String b) {
		System.out.println("full name  is "+(a+"   " +b));
	}
	public static void main(String[] args) {
		addition("ram ", " kumar");
		addition(11.2f,44.5f);
		addition(32, 33);
		addition(1,2,3);
	}
	
}
