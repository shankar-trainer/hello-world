public class SavingAccount  extends Account{

	private float intRate;
	private int time;
	
	public SavingAccount(int actId, String actName, float actBal, float intRate, int time) {
		super(actId, actName, actBal);
		this.intRate = intRate;
		this.time = time;
	}
	
	public float getIntRate() {
		return intRate;
	}
	public int getTime() {
		return time;
	}
	@Override
	float interestCalculation() {
		return getActBal()*getIntRate()*getTime()/100;
	}
	
	public static void main(String[] args) {
		//Account account=new Account();
		
		SavingAccount savingAccount=new SavingAccount(565665,"devendra kumar", 60000, 5.5f, 10);
		System.out.println(savingAccount.getActId());
		System.out.println(savingAccount.getActName());
		System.out.println(savingAccount.getActBal());

		System.out.println(savingAccount.getIntRate());
		System.out.println(savingAccount.getTime());
		
		System.out.println("Interest Amount "+savingAccount.interestCalculation());
		
		savingAccount.deposit(5000);
		System.out.println("after deposit balance is "+savingAccount.getActBal());
		
		savingAccount.withdraw(1000);
		System.out.println("after withdraw balance is "+savingAccount.getActBal());
		
	}
}
