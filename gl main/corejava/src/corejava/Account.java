package corejava;

public class Account {

	private float  balance;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void withdraw(int amt){
		if(amt>balance)
			System.out.println("insufficient balance");
		else
			balance=balance-amt;
	}
	public void deposit(int amt){
		balance=balance+amt;
	}
	
	
}
