
public class InterestCalculation {

	public static void main(String[] args) {
		float amount=56000.67f;
		float rate=0.05f;
		int time=10;
		
		float interest=amount*rate*time;
		System.out.println("**** Interest Calculation Program ****  ");
		System.out.println("\tAmount is "+amount);
		System.out.println("\tRate is "+rate);
		System.out.println("\tTime is "+time);
		System.out.println("\tInterest  is "+interest);
		
		System.out.println();
		System.out.println("\tAmount is "+amount+"\n\trate is "+rate+"\n\tTime is "+time+"\n\tInterest is "+interest);
		
	}
}
