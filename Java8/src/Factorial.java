import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no for factorial ");
		
		int x=scanner.nextInt();
		 int counter=1,fact=1;
		while(counter<=x) {
			fact=fact*counter;
			counter++;
		}
		
		System.out.println("factorial  of "+x+" is "+fact);
		
		System.out.printf("factorial  of %d is  %d",x,fact);
		scanner.close();
		
	}
}
