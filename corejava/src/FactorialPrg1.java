import java.util.Scanner;

public class FactorialPrg1 {

	static long getFactorial(int p) {
		int count = 1;
		long fact = 1;
		do {
			fact = fact * count;
			count++;
		} while (count <= p);
		return fact;
	}
	
	static long getFactorial1(int p) {
		int count = p;
		long fact = 1;
		do {
			fact = fact * count;
			count--;
		} while (count >= 1);
		return fact;
	}
	

	public static void main(String[] args) {

		int x = new Scanner(System.in).nextInt();

		System.out.println("Factorial of "+x+" is "+getFactorial(x));

		x = new Scanner(System.in).nextInt();

		System.out.println("Factorial of "+x+" is "+getFactorial1(x));
		
	}
}
