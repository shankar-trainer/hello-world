import pack1.Calculation;

public class CalculationMain {

	public static void main(String[] args) {
		Calculation.addition(1, 2);
		Calculation.subtraction(11, 3);
		Calculation.multiplication(2, 4);
		Calculation.division(12, 4);

		System.out.println(Math.pow(3, 4));
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.sin(Math.PI / 2));

		System.out.println(Integer.sum(11, 4));
		

	}
}
