
public class Account {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	void deposit(int amt) {
             if(amt>balance)
            	 System.out.println("insufficient balance");
             else
		balance = balance + amt;
	}

	void withdraw(int amt) {
		balance = balance - amt;
	}

}
