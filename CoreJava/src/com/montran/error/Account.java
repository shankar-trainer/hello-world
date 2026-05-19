package com.montran.error;

public class Account {

	private int actId;
	private String actName;
	private float actBalance;

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) throws AccountException {
		if (actId <= 0)
			throw new AccountException("account id cannot be -ve or zero");

		else if (!(actId >= 10000 && actId <= 20000))
			throw new AccountException("account id must be in range 10000 -  20000");
		else
			this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) throws AccountException {
		if (actName.isEmpty())
			throw new AccountException("account name  cannot be empty");
		else if (actName.length() < 10 || actName.length() > 20)
			throw new AccountException("account name  length must be og 10 -20 chars ");
		else
			this.actName = actName;
	}

	public float getActBalance() {
		return actBalance;
	}

	public void setActBalance(float actBalance) throws AccountException {
		if (actBalance <= 0)
			throw new AccountException("account  balance can not be -ve or zero ");
		else if (actBalance < 10000 || actBalance > 100000)
			throw new AccountException("invalid account  balance  must be 10000 - 1000000 ");
		else
			this.actBalance = actBalance;
	}

	public void withdraw(int amt) {
		actBalance = actBalance - amt;
	}

	public void deposit(int amt) {
		actBalance = actBalance + amt;
	}

}
