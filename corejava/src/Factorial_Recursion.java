import java.util.Scanner;

public class Factorial_Recursion {

	static int fact(int b) {
		if (b <= 1)
			return 1;
		else
			return b * fact(b - 1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter a no");
		int n = sc.nextInt();
		int  res=fact(n);
		System.out.println("factorial is "+res);
		sc.close();

	}
}
