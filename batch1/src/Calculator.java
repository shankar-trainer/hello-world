
public class Calculator {

	static int addition(int a, int b) {
		return a + b;
	}

	static int subtraction(int a, int b) {
		return a - b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}

	static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
      int a=10,b=4;
      System.out.println("Addition is "+addition(a, b));
      System.out.println("Subtraction is "+subtraction(a, b));
      System.out.println("multiplication is "+multiplication(a, b));
      System.out.println("division is "+division(a, b));
      System.out.println(Math.PI);
      System.out.println(Math.E);
      System.out.println(Math.sin(Math.PI/2));
      
	}

}
