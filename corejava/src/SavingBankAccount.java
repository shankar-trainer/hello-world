public class SavingBankAccount extends BankUser 
implements BankAccount {
	private float amt;
	private float rate;
	
	public float getAmt() {
		return amt;
	}

	public float getRate() {
		return rate;
	}

	public SavingBankAccount(float amt, float rate) {
		super();
		this.amt = amt;
		this.rate = rate;
	}

	@Override
	void bankUserInfo() {
	
		System.out.println("====Bank Information ====");
		System.out.println("\tId : "+getUserId());
		System.out.println("\tName : "+getUserName());
		System.out.println("\tAge : "+getUserAge());
		System.out.println("\tAmount  : "+getAmt());
		System.out.println("\tInterest rate   : "+getRate());
	}

	@Override
	public void bankAccountInfo() {
		System.out.println("\n====Bank Account Info==");
	    System.out.println("\tLocation :"+location);
	    System.out.println("\tCountry :"+country);
	}

	@Override
	public void withdraw(float a) {
         this.amt=this.amt-a;		
  	}

	@Override
	public void deposit(float a) {
		this.amt=this.amt+a;		
	}
	

}
