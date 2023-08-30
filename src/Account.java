
public abstract class   Account {

	protected int accountNumber;
	protected Customer1 customerObj;
	protected double balance;

	public Account(int accountNumber, Customer1 customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amount);

}
