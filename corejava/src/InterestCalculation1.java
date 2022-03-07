import java.util.Scanner;

public class InterestCalculation1 {

	public static void main(String[] args) {
		float amount,rate;
		int time;
		float interest;
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter amount");
		amount=sc.nextFloat();
		}
		while(amount<=0);// condition is checked in the last 
		
		do {
		System.out.println("Enter rate");
		rate=sc.nextFloat();
		}
		while(rate<=0);
		do {
		System.out.println("Enter time");
		time=sc.nextInt();
		}
		while(time<=0);
		
		interest=amount*rate*time/100;
		
		System.out.println("Interest is "+interest);
		//sysout ctrl +space 
		sc.close();
	}

}
