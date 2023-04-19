public class Account {
	Department department;
	
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void deposit(float amt) {
		balance = balance + amt;
	}

	public void withdraw(float amt) {
		if (amt > balance)
			System.out.println("insufficient balance to withdraw");
		else
			balance = balance - amt;
	}
}
