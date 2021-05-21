public abstract  class MyBank {

	private int bankId;
	private String  bankName;
	private String bankLocation;
	private float bankbalance;

	abstract float interestCalculation();
	abstract void bankInfo();
	
	public void deposit(float bankbalance) {
		this.bankbalance=this.bankbalance+bankbalance;
	}
	
	public void withdraw(float amt) {
		this.bankbalance=this.bankbalance-amt;
	}
	
	
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public float getBankbalance() {
		return bankbalance;
	}
	public void setBankbalance(float bankbalance) {
		this.bankbalance = bankbalance;
	}

	@Override
	public String toString() {
		return "MyBank [bankId=" + bankId + ", bankName=" + bankName + ", bankLocation=" + bankLocation
				+ ", bankbalance=" + bankbalance + "]";
	}
}


