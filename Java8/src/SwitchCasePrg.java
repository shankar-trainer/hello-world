import java.util.Scanner;

public class SwitchCasePrg {

	public static void main(String[] args) {
		int x,y,z;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two no");
		x=scanner.nextInt();
		y=scanner.nextInt();
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Reminder");
		z=scanner.nextInt();
		switch (z) {
		case 1:
			System.out.println("Addition is "+(x+y));
			break;
		case 2:
			System.out.println("Subtraction  is "+(x-y));
			break;
		case 3:
			System.out.println("Multiplication is "+(x*y));
			break;
		case 4:
			System.out.println("Division is "+(x/y));
			break;
		case 5:
			System.out.println("Reminder is "+(x%y));
			break;
			
		default:
			System.out.println("Wrong Choice");
			break;
		}
		/*
		if(z==1) 
			System.out.println("Addition is "+(x+y));
			
		else if(z==2) 
			System.out.println("Subtraction is "+(x-y));
		
		else if(z==3) 
			System.out.println("Multiplication is "+(x*y));
		
		else if(z==4) 
			System.out.println("Division is "+(x/y));
		
		else if(z==5) 
			System.out.println("Reminder is "+(x%y));
		else
			System.out.println("Wrong choice");
		*/
	}
}
