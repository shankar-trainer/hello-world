
public class Lic {

	private float amt;
	private int time;
	private int licRegNo;
	private String licName;
	// private final float licInterestRate=0.56f;
	private final float licInterestRate;


	public Lic(float amt, int time, int licRegNo, String licName, float licInterestRate) {
		super();
		this.amt = amt;
		this.time = time;
		this.licRegNo = licRegNo;
		this.licName = licName;
		this.licInterestRate = licInterestRate;
	}

	public final float interest() {
		return amt * licInterestRate * time;
	}

	
}
