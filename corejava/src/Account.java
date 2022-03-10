
public class Account {
	private int id;
	private String name;
	private float balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void deposit(float amt) {
		balance = balance + amt;
	}

	public void withdraw(float amt) {
		balance = balance - amt;
	}

}
