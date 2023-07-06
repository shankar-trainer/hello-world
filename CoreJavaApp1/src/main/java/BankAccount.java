public class BankAccount {

	int accNo;
	String custName;
	String accType; // string (indicates ‘Savings’ or ‘Current’)
	float balance;

	public BankAccount(int accNo, String custName, String accType, float balance) {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	void deposit(float amt) throws NegativeAmount {
		if (amt < 0)
			throw new NegativeAmount();
		else
			balance = balance + amt;
	}

	void withdraw(float amt) throws InsufficientFunds, NegativeAmount {

		if (accType.equals("Saving")) {
			if (balance < 1000)
				throw new InsufficientFunds();
			else if (amt < 0)
				throw new NegativeAmount();
			else
				balance = balance - amt;
		}
		if (accType.equals("Current")) {
			if (balance < 5000)
				throw new InsufficientFunds();
			else if (amt < 0)
				throw new NegativeAmount();
			else
				balance = balance - amt;
		}
	}

	float getBalance() throws LowBalanceException, InsufficientFunds {
		if (accType.equals("Saving")) {
			if (balance < 1000)
				throw new LowBalanceException();
		}
		if (accType.equals("Current")) {
			if (balance < 5000)
				throw new InsufficientFunds();

		}
		return balance;
	}
}
