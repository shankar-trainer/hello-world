import java.util.Scanner;

public class Factorial {

	int getFactorial(int p) {

		int fact = 1;
		for (int i = 1; i <= p; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		int res = factorial.getFactorial(x);

		System.out.println("factorial of " + x + " is " + res);
		System.out.println("=======");
		System.out.println("Enter a number");

		System.out.println(factorial.getFactorial(sc.nextInt()));

	}
}
