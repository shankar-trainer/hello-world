
public class Account {

	private int balance;

	int getBalance() {
		return balance;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit(int amt) {
		setBalance(getBalance() + amt);
	}

	void withdraw(int amt) {
		if (amt > getBalance())
			System.out.println("insufficeint amount");
		else
			setBalance(getBalance() - amt);
	}
}
