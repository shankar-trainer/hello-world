public final  class InterestCalculation {

	private float amt;
	private int time;
	// private final float rate = 0; // inline initialization
	private final float rate; // final must be initialized either inline or inside constructor

	public InterestCalculation() {
		rate = 0.05f; // initialization inside constructor
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public float getRate() {
		return rate;
	}

	final  float interest() {
		return amt * rate * time / 100;
	}
	float speed(float d1,float d2) {
		return (d1+d2)/2;
	}

	public static void main(String[] args) {
		InterestCalculation calculation = new InterestCalculation();
		calculation.amt = 1200;
		calculation.time = 7;
		// calculation.rate=0.07f;// final error
	}

}
