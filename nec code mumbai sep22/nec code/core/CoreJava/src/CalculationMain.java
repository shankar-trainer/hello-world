
public class CalculationMain {

	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println("sum of " + a + " and " + b + " is " + Calculation.addition(a, b));

		System.out.printf("\nsum of %d  and %d is ", a, b, Calculation.addition(a, b));
		System.out.printf("\nsubtraction of %d  and %d is ", a, b, Calculation.subtraction(a, b));

		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.sin(Math.PI / 2));
		
		

	}
}
