import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no");
		int n = sc.nextInt();
		int fact=1;
		// 1*2*3*4*5
		//5*4*3*2*1
		
		for (int i = 1; i <=n; i++) {
		  fact=fact*i;	
		}
		
		System.out.println("factorial of "+n+" is "+fact);
		
		System.out.printf("\nfactorial of %d is %d",n,fact);
		
        sc.close();
	}
}
