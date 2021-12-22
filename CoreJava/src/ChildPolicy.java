
public class ChildPolicy extends Lic {

	
	private int age;

	public ChildPolicy(float amt, int time, int licRegNo, String licName, float licInterestRate, int age) {
		super(amt, time, licRegNo, licName, licInterestRate);
		this.age = age;
	}

	// final method cannot be overridden
	/*
	 * @Override public float interest() { return 68788778; //return
	 * super.interest(); }
	 */

	public static void main(String[] args) {
		ChildPolicy childPolicy = new ChildPolicy(67000, 5, 12, "jeevan anand", 0.67f, 10);
		System.out.println("Interest amount is " + childPolicy.interest());
	}
}
