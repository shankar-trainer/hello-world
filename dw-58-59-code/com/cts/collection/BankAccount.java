package com.cts.collection;

public class BankAccount implements Comparable<BankAccount> {
	private int actNo;
	private String name;
	private float balance;

	@Override
	public int compareTo(BankAccount o) {
		if (this.actNo > o.getActNo())
			return 1;
		
		else if (this.actNo == o.getActNo())
			return 0;
		else 
			return -1;
	}
	
	int getActNo() {
		return actNo;
	}

	void setActNo(int actNo) {
		this.actNo = actNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	float getBalance() {
		return balance;
	}

	void setBalance(float balance) {
		this.balance = balance;
	}


}
