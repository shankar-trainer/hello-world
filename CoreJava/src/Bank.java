public abstract class Bank {
	private float amt;
	private float rate;
	private int time;
	
	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Bank(float amt, float rate, int time) {
		super();
		this.amt = amt;
		this.rate = rate;
		this.time = time;
	}

	abstract float interest();

	 public void bankInfo() {
		 System.out.println("Bank information ");
		 System.out.println("\tamount is "+amt);
		 System.out.println("\ttime is "+time);
		 System.out.println("\trate is "+rate);
	 }
}

class SavingBank extends Bank{
	private String location;

	public SavingBank(float amt, float rate, int time, String location) {
		super(amt, rate, time);
		this.location = location;
	}

	@Override
	public void bankInfo() {
		super.bankInfo();
		System.out.println("\tlocation is "+location);
	}
	@Override
	float interest() {
		return getRate()*getAmt()*getTime();
	}
}
