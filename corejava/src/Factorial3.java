import java.util.Scanner;

public class Factorial3 {

	static void factorial(int p) {
		int fact=1;
		
		for (int i = p; i>=1; i--) {
		  fact=fact*i;	
		}
		System.out.printf("\nfactorial of %d is %d",p,fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter a no");
		int n = sc.nextInt();
		factorial(n);
		
		System.out.println("Enter a no");
		n = sc.nextInt();
		factorial(n);
		
        sc.close();
	}
}
