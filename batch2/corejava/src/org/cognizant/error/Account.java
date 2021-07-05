package org.cognizant.error;

public class Account {
	private int actId;
	private String actName;
	private float actBalance;

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) throws AccountException {
		if(actId<=0)
			throw new  AccountException("invalid account id");
		else
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) throws AccountException {
		if(actName.isEmpty())
			throw new AccountException("name is empty");
		else
		this.actName = actName;
	}

	public float getActBalance() {
		return actBalance;
	}

	public void setActBalance(float actBalance) throws AccountException {
		if(actBalance<=0)
			throw new AccountException("invalid balance");
		else
		this.actBalance = actBalance;
	}

}
