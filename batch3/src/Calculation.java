import java.util.Scanner;

public class Calculation {

	static float addition(float a,  float b) {
		return a+b;
	}
	
	static float subtraction(float a,  float b) {
		return a-b;
	}
	
	static float multiplication(float a,  float b) {
		return a*b;
	}
	
	static float division(float a,  float b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		Scanner   sc=new Scanner(System.in);
		System.out.println("enter two no");
		float x=sc.nextFloat(); 
		float y=sc.nextFloat(); 
	
		System.out.println("select operation");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
	
		int operation=sc.nextInt();
		
		switch (operation) {
		case 1:
			 System.out.println("Addition is "+addition(x, y));
			break;
			
		case 2:
			System.out.println("Subtraction is "+subtraction(x, y));
			break;
			
		case 3:
			System.out.println("Multiplication is "+multiplication(x, y));
			break;
			
		case 4:
			System.out.println("Division is "+division(x, y));
			break;
			

		default:
			System.out.println("wrong choice");
			break;
		}
	}
}
