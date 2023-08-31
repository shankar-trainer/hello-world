package com.coforge.abc;

public class SavingAccount extends AccountUser implements User, Account {

	private float amount;
	private int time;

	public SavingAccount(int id, String name, float salary, float amount, int time) {
		super(id, name, salary);
		this.amount = amount;
		this.time = time;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public void deposit(float amt) {
		this.amount = this.amount + amt;
	}

	@Override
	public void withdraw(float amt) {
		this.amount = this.amount - amt;

	}

	@Override
	public void userInfo() {
		System.out.println("Country is " + User.country);
		System.out.println("Country is " + User.state);
		// System.out.println("Country is "+country);
	}

	@Override
	public void accountUserInfo() {
		System.out.println("account User Info");
		System.out.println("\tId "+getId());
		System.out.println("\tName "+getName());
		System.out.println("\tSalary "+getSalary());
		System.out.println("\tAccount Balance "+getAmount());
		System.out.println("\tTime "+getTime());
	}

	public static void main(String[] args) {

		SavingAccount account=new SavingAccount(1001, "suresh kumar",12000, 30000, 5);
		
		account.accountUserInfo();
		account.userInfo();
		
		account.deposit(2000);
		account.accountUserInfo();
		
		account.withdraw(5000);
		account.accountUserInfo();
	}
}
