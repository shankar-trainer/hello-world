package com.coforge.exception;

public class Account {

	private long accountId;
	private String accountName;
	private float balance;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) throws Exception {
		if (accountId <= 0)
			throw new Exception("account id can not be <0");

		else if (accountId < 5000 || accountId > 10000)
			throw new Exception("account id must of range 5000 - 100000");
		else
			this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) throws Exception {
		if (accountName.isBlank())
			throw new Exception("account name can not be blank");
		else if (accountName.length() < 5 || accountName.length() > 10)
			throw new Exception("account name length must of 5 - 10 character");
		else
			this.accountName = accountName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) throws Exception {
		if (balance <= 0)
			throw new Exception("account balance is zero or -ve");
		else if (balance < 5000)
			throw new Exception("account balance can not be <5000");
		else
			this.balance = balance;
	}

}
