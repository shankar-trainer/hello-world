abstract class   UserAccount{
	private int accountId;
	private String accountType;
	private String accountLocation;
	private float accountBalance;
	
	public UserAccount(int accountId, String accountType, String accountLocation, float accountBalance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountLocation = accountLocation;
		this.accountBalance = accountBalance;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountLocation() {
		return accountLocation;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void deposit(float amt) {
		this.accountBalance=this.accountBalance+amt;
		
	}
	public void  withdraw(float amt) {
		this.accountBalance=this.accountBalance-amt;
	}
	abstract void userAccountInfo();
}

public class EmployeeAccount {

	private int employeeId;
	private String employeeName;
	
}
