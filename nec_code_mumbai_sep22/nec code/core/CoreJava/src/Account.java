
public abstract  class Account {
	private int actNo;
	private String actName;
	private float actBal;
	
	public void setActBal(float actBal) {
		this.actBal = actBal;
	}
	
	public float getActBal() {
		return actBal;
	}

	public Account(int actNo, String actName, float actBal) {
		super();
		this.actNo = actNo;
		this.actName = actName;
		this.actBal = actBal;
	}

	@Override
	public String toString() {
		return "Account Information  \n\tactNo=" + actNo + "\n\tactName=" + actName + "\n\tactBal=" + actBal ;
	}

	public abstract void withdraw(int amt);
	public abstract void deposit(int amt);
	
}
