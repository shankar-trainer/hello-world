
public class bank {

	private String accountName;
	private String bankName;
	private int accountNo;

//private final float interestRate=0.05f;
	private final float interestRate;

	// blank final
	
	public void setInterestRate(float intRate) {
	//	this.interestRate=intRate;
	}

	public bank() {
		interestRate = 0.06f;
	}

	public bank(String accountName, String bankName, int accountNo) {
		this.interestRate = 0;
		this.accountName = accountName;
		this.bankName = bankName;
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "bank [accountName=" + accountName + ", bankName=" + bankName + ", accountNo=" + accountNo
				+ ", interestRate=" + interestRate + "]";
	}

}
