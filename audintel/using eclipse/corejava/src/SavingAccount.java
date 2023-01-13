
public class SavingAccount extends Account {

	private String location;
	private float minBalance;

	public SavingAccount(long actNo, String actName, long actBalance, float interestRate, String location,
			float minBalance) {
		super(actNo, actName, actBalance, interestRate);
		this.location = location;
		this.minBalance = minBalance;
	}
	
	@Override
	void accountInfo() {
		super.accountInfo();
		System.out.println("\t Min balance "+minBalance);
		System.out.println("\t Location "+location);
	}
	
	public static void main(String[] args) {
	//	SavingAccount account=new SavingAccount(23323,"arvind kumar",12000,0.05f,"new delhi",1000);
		Account account=new SavingAccount(23323,"arvind kumar",12000,0.05f,"new delhi",1000);
		
		account.accountInfo();
		
		System.out.println("\nInterest is "+account.interestCalculation());
	}
	
}
