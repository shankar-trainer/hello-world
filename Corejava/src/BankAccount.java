public class BankAccount {
	int accountNumber;
	float balance;
	String ownerName;

	public BankAccount(int accountNumber, float balance, String ownerName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	 void add(float amt) {
		balance = balance + amt;
	}
	void subtract(float amt) {
		balance = balance - amt;
	}

	float balance() {
		return balance;
	} 
     
}
