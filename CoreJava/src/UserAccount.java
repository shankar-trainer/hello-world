public class UserAccount extends BankAccount {
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void deposit(float amt) {
		setAccountBalance(getAccountBalance() + amt);
	}

	public void withdrawl(float amt) {
		setAccountBalance(getAccountBalance() - amt);
	}

	@Override
	public void accountInfo() {
		System.out.println("account no "+getAccountNo());
		System.out.println("account balance "+getAccountBalance());
		System.out.println("account name "+getAccountName());
		System.out.println("account location "+getLocation());
	}

}
