import java.util.Scanner;

public class InputPrg {

	public static void main(String[] args) {
		float x,y,z;
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter no1");
		x=sc.nextFloat();
		
		System.out.println("Enter no2");
		y=sc.nextFloat();
		z=x+y;
		System.out.printf("sum of %f and %f is %f",x,y,x+y);
		
		System.out.println("\nsum of"+x+" and "+y+"is "+z);
		
		System.out.println("Enter name");
	//	String name=sc.next();// next() for single word
		
		sc.nextLine();
		String name=sc.nextLine();//nextLine() for multi word
		
		System.out.println("name is "+name);

	}
}
