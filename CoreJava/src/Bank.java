
public class Bank {

	private int bankRegNo;
	private String bankName;
	private final float intRate;

	public Bank(int bankRegNo, String bankName, float intRate) {
		super();
		this.bankRegNo = bankRegNo;
		this.bankName = bankName;
		this.intRate = intRate;
	}
	
	final float intCalc(int amount,int time) {
		  return amount*intRate*time/100;
	}

	@Override
	public String toString() {
		return "Bank [bankRegNo=" + bankRegNo + ", bankName=" + bankName + ", intRate=" + intRate + "]";
	}

	
	
}
