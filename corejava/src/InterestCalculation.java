
public class InterestCalculation {

	static float getInterest(float a, float r, int t) {
		return a*r*t/100;
	}
	
	public static void main(String[] args) {
		float amt;
		float rate;
		int time;
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter amount");
		amt=sc.nextFloat();
		
		System.out.println("Enter rate");
		rate=sc.nextFloat();
		
		System.out.println("Enter time");
	    time=sc.nextInt();
		
		System.out.println("Interest is "+getInterest(amt, rate, time));
		sc.close();
	}
	
}
