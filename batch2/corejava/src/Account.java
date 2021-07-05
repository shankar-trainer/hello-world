
public abstract class Account {
	private int actId;
	private String actName;
	private float actBal;

	abstract float interestCalculation();
	
	public void deposit(float amt) {
		this.actBal = this.actBal + amt;
	}

	public void withdraw(float amt) {
		this.actBal = this.actBal - amt;
	}

	public Account(int actId, String actName, float actBal) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.actBal = actBal;
	}

	public int getActId() {
		return actId;
	}

	public String getActName() {
		return actName;
	}

	public float getActBal() {
		return actBal;
	}

}
