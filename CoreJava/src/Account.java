public abstract class Account {

	private int actNo;
	private String actName;
	private float actBalance;

	private String actLocation;

	public Account(int actNo, String actName, float actBalance, String actLocation) {
		super();
		this.actNo = actNo;
		this.actName = actName;
		this.actBalance = actBalance;
		this.actLocation = actLocation;
	}

	public float getActBalance() {
		return actBalance;
	}

	public void setActBalance(float actBalance) {
		this.actBalance = actBalance;
	}

	public abstract void deposit(float amount);

	public abstract void withdraw(float amount);

	void accountInfo() {
		System.out.println("Account No " + actNo);
		System.out.println("Account Name " + actName);
		System.out.println("Account Balance " + actBalance);
		System.out.println("Account Location " + actLocation);
	}
}

interface SavingAccount {
	float intRate = 0.05f; // public static final

	float interest();// public abstract
}

class MyAccount extends Account implements SavingAccount {
	int time;

	public MyAccount(int actNo, String actName, float actBalance, String actLocation, int time) {
		super(actNo, actName, actBalance, actLocation);
		this.time = time;
	}

	@Override
	public float interest() {
		return getActBalance() * intRate * time;
	}

	@Override
	public void deposit(float amount) {
		setActBalance(getActBalance() + amount);
	}

	@Override
	public void withdraw(float amount) {
		setActBalance(getActBalance() - amount);
	}

	public static void main(String[] args) {
       MyAccount account=new MyAccount(756567,"sri kumar", 20000, "mumbai", 12);
       account.accountInfo();
       
       account.deposit(2000);
       System.out.println("after deposit  account balance is "+account.getActBalance());
       
       account.withdraw(500);
       System.out.println("after withdraw  account balance is "+account.getActBalance());
       System.out.println("total interest is "+account.interest());
	}
}
