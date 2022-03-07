import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);
		System.out.println("Enter no ");
		int z=scanner.nextInt();
		int sum=0;
		int rem;
		do {
		 	rem=z%10;
		 	sum=sum+rem;
			z=z/10;
		}
		while(z!=0);
		System.out.println("sum of digit is "+sum);
		scanner.close();
	}
}
