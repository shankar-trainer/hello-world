public class InterestCalc {

	static float calc() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		float amt;
		float rate;
		int time;
		do {
			System.out.println("Enter amount >=0");
			amt = sc.nextFloat();
		} while (amt <= 0);

		do {
			System.out.println("Enter rate  >=0");
			rate = sc.nextFloat();
		} while (rate <= 0);

		do {
			System.out.println("Enter time >=0");
			time = sc.nextInt();
		} while (time <= 0);
		sc.close();
		
		return (amt * rate * time) / 100.0f;
	}

	public static void main(String[] args) {
		System.out.println("interest is " + calc());
	}
}
