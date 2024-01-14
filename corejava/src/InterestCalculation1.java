
public class InterestCalculation1 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		float amt;
		float rate;
		int time;
				
		do {
		System.out.println("Enter amount");
		amt=sc.nextFloat();
		}
		while(amt<=0);
		
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
		
		float i=amt*rate*time/100;
		System.out.println("Interest is "+i);
		
		sc.close();
	}
}
