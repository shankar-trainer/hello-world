import java.util.Scanner;

public class MyCalculatorMain {

	public static void main(String[] args) {
		 String ch="y";
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter two number");
		  float a=sc.nextFloat();
		  float b=sc.nextFloat();
		 
		while(ch.equals("y")) {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			int operation=sc.nextInt();
			/*
			if(operation==1)
				System.out.println("Addition is "+MyCalculator.addition(a, b));
			if(operation==2)
				System.out.println("Subtraction is "+MyCalculator.subtraction(a, b));
			if(operation==3)
				System.out.println("Multiplication is "+MyCalculator.multiplication(a, b));
			if(operation==4)
				System.out.println("Division is "+MyCalculator.division(a, b));
			if(operation==5)
				System.out.println("Modulus is "+MyCalculator.modulus(a, b));
			*/
			switch (operation) {
			case 1: 
				System.out.println("Addition is "+MyCalculator.addition(a, b));
				break;
				
			case 2: 
				System.out.println("Subtraction is "+MyCalculator.subtraction(a, b));
							break;
				
			case 3: 
				System.out.println("Multiplication is "+MyCalculator.multiplication(a, b));
				break;
				
			case 4: 
				System.out.println("Division is "+MyCalculator.division(a, b));
				break;
				
			case 5: 
				System.out.println("Modulus is "+MyCalculator.modulus(a, b));
				break;
				
			
			default:
			System.out.println("Uknown operation");
			}
			
			System.out.println("continue y\\n");
			ch=sc.next();
			
		}
	}
}
