package com.cts.error;

public class Account {

	int amount;

	void deposit(int bal) {
		this.amount = this.amount + bal;
	}

	void withdraw(int bal) throws AccountException {
		if (bal >= amount)
			throw new AccountException("withdraw amount is greater than balance");
		else
			this.amount = this.amount - bal;
	}

	public static void main(String[] args) {

		Account account = new Account();
		try {
			account.deposit(5000);
			System.out.println("account balance is " + account.amount);
			
			account.withdraw(10000);
			
			System.out.println("account balance after withdrawl " + account.amount);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
	}

}
