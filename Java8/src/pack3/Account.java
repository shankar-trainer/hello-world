package pack3;

public abstract class Account {

	private int actId;
	private String actName;
	private float actBalance;

	public abstract void accountOpen(); 
	public abstract void accountClose(); 
	
	public void withdraw(float amt) {
		actBalance = actBalance - amt;
	}

	public void deposit(float amt) {
		actBalance = actBalance + amt;
	}

	
	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getActBalance() {
		return actBalance;
	}

	public void setActBalance(float actBalance) {
		this.actBalance = actBalance;
	}
	@Override
	public String toString() {
		return "\n\nAccount Information  \n\tactId=" + actId + ", \n\tactName=" + actName + ", \n\tactBalance=" + actBalance + "";
	}

	
}
