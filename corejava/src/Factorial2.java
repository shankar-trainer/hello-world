import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no");
		int n = sc.nextInt();
		int fact=1;
		//5*4*3*2*1
		
		for (int i = n; i>=1; i--) {
		  fact=fact*i;	
		}
		
		System.out.printf("\nfactorial of %d is %d",n,fact);
        sc.close();
	}
}
