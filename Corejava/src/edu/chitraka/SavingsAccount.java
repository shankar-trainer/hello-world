package edu.chitraka;

public class SavingsAccount extends Account {
	public SavingsAccount(int accountNumber, Customer customerObj, double balance) {
		super(accountNumber, customerObj, balance);
	}

	double minimumBalance;

	@Override
	public boolean withdraw(double amount) {
		return false;
	}
}
