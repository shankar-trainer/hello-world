import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.System.out;

public class CalculationMain2 {

	public static void main(String[] args) {
		int a = 10, b = 5;
		out.println("sum of " + a + " and " + b + " is " + Calculation.addition(a, b));

		out.printf("\nsum of %d  and %d is ", a, b, Calculation.addition(a, b));
		out.printf("\nsubtraction of %d  and %d is ", a, b, Calculation.subtraction(a, b));

		out.println(E);
		out.println(Math.PI);

		System.out.println(sin(PI / 2));

	}
}
