
public class MathOperation {

	static void addition(int a, int b) {
		System.out.println("addition is "+(a+b));
	}
	static void subtraction(int a, int b) {
		System.out.println("subtraction is "+(a+b));
	}
	static void multiplication(int a, int b) {
		System.out.println("multiplication is "+(a*b));
	}
	
	public static void main(String[] args) {
		addition(1, 2);
		addition(11, 22);
		subtraction(10,4);
		multiplication(10,5);
		
		System.out.println(Math.PI);
		System.out.println(Math.sin(3.14/2));
		System.out.println(Math.tan(3.14/4));
	}
}
