
public class CheckPrime {

	static boolean isPrime(int n) {
		int c = 2;
		if(n==2)
			return true;
		do {
			if (n % c == 0)
				return false;
			c++;
		} while (c <= n - 1);

		return true;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a + " is prime  :" + isPrime(a));

		sc.close();

	}
}
