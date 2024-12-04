public class CalculatorTest {

	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println("Addition of " + a + " and " + b + " is " + Calculator.addition(a, b));
		System.out.println("Subtraction of " + a + " and " + b + " is " + Calculator.subtraction(a, b));
		System.out.println("Multiplication of " + a + " and " + b + " is " +Calculator.multiplication(a, b));
		System.out.println("Division of " + a + " and " + b + " is " + Calculator.division(a, b));
	}
}
