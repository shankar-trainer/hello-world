
public class Bank {
	private int bankId;
	private String bankName;
	private String location;
//private final  float interestRate=3.2f;
	private final float interestRate;
//private static final String countryName = "";

	private static final String countryName;
	public Bank(int bankId, String bankName, String location, float interestRate) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.location = location;
		this.interestRate = interestRate;
	}

	static {
		countryName = "india";
	}

//public Bank() {
//	this.interestRate = 5.5f;
//}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", location=" + location + ", interestRate="
				+ interestRate + "]";
	}

}
