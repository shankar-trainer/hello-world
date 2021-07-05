import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no ");
		int a=sc.nextInt();
	    int fact=1;
	    int c=1;
	    
		do {
		fact=fact*c++;
		} while (c<=a);
		System.out.println("factorial of "+a+" is "+fact);
	}
}
