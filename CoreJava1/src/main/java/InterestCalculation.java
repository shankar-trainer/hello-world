public class InterestCalculation {

	static float interest(float amt, float rate, int time) {
		return amt * rate * time / 100;
	}

	public static void main(String[] args) {

		float a, r;
		int t;

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter amount");
		a=sc.nextFloat();
		
		System.out.println("Enter rate");
		r=sc.nextFloat();
		
		System.out.println("Enter time");
		t=sc.nextInt();
		
		float interest = interest(a, r, t);
		System.out.println("Interest is "+interest);

	}
}
