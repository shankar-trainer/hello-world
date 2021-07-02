
public class Account {

	private int accountId;
	private String accountName;
	private float accountBalance;

	public Account(int accountId, String accountName, float accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

}

class SavingAccount extends Account {

	private float interestRate;
	private int time;
	private String location;

	public SavingAccount(int accountId, String accountName, float accountBalance, float interestRate, int time,
			String location) {
		super(accountId, accountName, accountBalance);
		this.interestRate = interestRate;
		this.time = time;
		this.location = location;
	}

	public float interestcalc() {
		return getAccountBalance()*interestRate*time/100;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public int getTime() {
		return time;
	}

	public String getLocation() {
		return location;
	}

}
