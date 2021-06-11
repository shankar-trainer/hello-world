import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float  x, y, z,a,b,c;
		
		x=56.6f;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st no");
		x=scanner.nextFloat();

		System.out.println("Enter 2nd no");
		y=scanner.nextFloat();

		z=x+y;
		a=x-y;
		b=x*y;
		c=x/y;
		
		System.out.println("sum is "+x);
		System.out.println("subtraction  is "+a);
		System.out.println("multiplication  is "+b);
		System.out.println("division is "+c);
	}
}
