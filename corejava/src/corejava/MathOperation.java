package corejava;

public class MathOperation {

	static int addition(int a, int b) {
		return a+b;
	}
	
	static int subtraction(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		int res1=addition(12, 34);
		int res2=subtraction(12, 34);
		
		System.out.println(res1);
		System.out.println(res2);
	}
	
}
