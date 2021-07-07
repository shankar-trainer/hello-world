
public class BankAccount {

	private int accountId;
	private String  accountName;
	private float accountBalance;
	
	public BankAccount(int accountId, String accountName, float accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public void deposit(float amt) {
		this.accountBalance=this.accountBalance+amt;
	}
	public void withdraw(float amt) {
		this.accountBalance=this.accountBalance-amt;
	}
	
	
	public int getAccountId() {
		return accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
}

class SavingAccount extends BankAccount{
	private float interestRate;
	private String location;
	
	public float getInterestRate() {
		return interestRate;
	}

	public String getLocation() {
		return location;
	}


	public SavingAccount(int accountId, String accountName, float accountBalance, float interestRate, String location) {
		super(accountId, accountName, accountBalance);
		this.interestRate = interestRate;
		this.location = location;
	}
	public void SavingAccountInfo() {
		System.out.println("Saving Account information ");
		System.out.println("Account id "+getAccountId());
		System.out.println("Account Name "+getAccountName());
		System.out.println("Account Name "+getAccountBalance());
		System.out.println("Account Interest Rate  "+getInterestRate());
		System.out.println("Account Location "+getLocation());
	}
	
}

class SavingAccountMain{
	
	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount(43443, "s kumar", 20000, 4.5f, "madurai");
		savingAccount.SavingAccountInfo();
		
		savingAccount.deposit(5000);
		System.out.println("\nAfter deposit the balance is "+savingAccount.getAccountBalance());
		savingAccount.withdraw(3000);
		System.out.println("\nAfter withdraw the balance is "+savingAccount.getAccountBalance());
		
	}
	
}