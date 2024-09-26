import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scanner.nextInt();
		int fact=1, counter=1;
		
		while (counter<=n) {
			fact=fact*counter;
			counter++;
		}
		
		System.out.println("factorial of "+n+" is "+fact);
		scanner.close();
	}
}
