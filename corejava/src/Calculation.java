
public class Calculation {

	static void info() {
		System.out.println("==========Calculation Program=======");
	}
	static void addition(int a, int b) {
	  System.out.println("sum of "+a+" and "+b+" is "+(a+b));
	}
	static void subtraction(int a, int b) {
		System.out.printf("subtraction of %d and %d is %d ",a,b,(a-b));
	}
	static int multiplication(int a, int b) {
	 return a*b;
	}
	static int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		info();
		int x=5;
		int y=3;
		
		addition(x, y);
		subtraction(x, y);
		int m=multiplication(x, y);
		
		System.out.printf("\nmultiplication of %d and %d is %d ",x,y,m);
		System.out.printf("\ndivision of %d and %d is %d ",x,y,division(x,y));
	}
}
