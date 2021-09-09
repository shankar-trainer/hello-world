import java.util.Scanner;

public class InterestCalculation {

	
	public static void main(String[] args) {
		float amount;
		float rate;
		int time;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter amount");
		amount=scanner.nextFloat();
		
		System.out.println("enter rate");
		rate=scanner.nextFloat();
		
		System.out.println("enter time");
		time=scanner.nextInt();
		
		float interest=amount*rate*time/100;
		System.out.println("amount is "+amount+"\nrate is "+rate+"\ntime is "+time+"\nInterest is "+interest);
		
		System.out.printf("\namount is  %f \nrate is %f\ntime is %d\nInterest is %f",amount,rate,time,interest);
		
		System.out.printf("\namount is  %.2f \nrate is %.2f\ntime is %d\nInterest is %.2f",amount,rate,time,interest);
		
	}
}
