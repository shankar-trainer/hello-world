
public class FactorialRecursion {

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static int factorial1(int n) {
		if(n==1)
			return 1;
		else
		return n*factorial1(n-1);
	}
	public static void main(String[] args) {

		int res=factorial(6);
		System.out.println(res);
		
		System.out.println(factorial1(5));
		System.out.println(factorial1(4));
	}
}
