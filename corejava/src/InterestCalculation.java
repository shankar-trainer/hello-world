import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		float amount,rate;
		int time;
		float interest;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		amount=sc.nextFloat();
		
		System.out.println("Enter rate");
		rate=sc.nextFloat();
		
		System.out.println("Enter time");
		time=sc.nextInt();
		
		interest=amount*rate*time/100;
		
		System.out.println("Interest is "+interest);
		//sysout ctrl +space 
		sc.close();
	}
}
