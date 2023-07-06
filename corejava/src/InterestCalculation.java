
public class InterestCalculation {

	public static void main(String[] args) {
		
		float amount=20000.0f;
		float rate=0.05f;
		int  time=8;
		
		System.out.println(amount);
		System.out.println(rate);
		System.out.println(time);
		
		System.out.printf("\n%.1f",amount);
		System.out.printf("\n%.2f",rate);
		System.out.printf("\n%d",time);
		
		float interest=amount*rate*time;
		System.out.println("\ninterest  is "+interest);
	}
}
