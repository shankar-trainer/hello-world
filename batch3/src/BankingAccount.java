public abstract class BankingAccount {
	private int actId;
	private String actname;

	abstract float intCalculation();
	
	public BankingAccount(int actId, String actname) {
		super();
		this.actId = actId;
		this.actname = actname;
	}

	@Override
	public String toString() {
		return "BankingAccount [actId=" + actId + ", actname=" + actname + "]";
	}
}
class CurrentAccount extends BankingAccount{
	private float balance;
	private float rate;
	private int time;
	
	public CurrentAccount(int actId, String actname, float balance, float rate, int time) {
		super(actId, actname);
		this.balance = balance;
		this.rate = rate;
		this.time = time;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCurrentAccount [balance=" + balance + ", rate=" + rate + ", time=" + time + "]";
	}

	@Override
	float intCalculation() {
		return balance*rate*time/100;
	}	
	 public static void main(String[] args) {
		CurrentAccount account=new CurrentAccount(45454, "abadhesh sharma",2000, 5.5f, 10);
		System.out.println(account);
		System.out.println("Interest is "+account.intCalculation());
	}
}
