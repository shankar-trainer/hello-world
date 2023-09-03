
public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, Customer1 customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	double minimumBalance;

	@Override
	public boolean withdraw(double amount) {
		if (balance-amount > minimumBalance) {
			balance=balance - amount;
			return true;
		}
		return false;
	}
}
