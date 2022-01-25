public class SavingBank extends Bank {
	private String location;
	private float rate;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public void bankInfo() {
		System.out.println("  account no  "+getAccountNo());
		System.out.println(" account name "+getAccountName());
		System.out.println(" location  "+getLocation());
		System.out.println(" rate  "+getRate());
	}

	public static void main(String[] args) {
		//Bank bank=new SavingBank();
		//Bank bank=new Bank();// abstract class cannot be instantiated 
		SavingBank bank=new SavingBank();
		bank.setAccountNo(887787887);
		bank.setAccountName("rahul kumar");
		bank.setLocation("patna");
		bank.setRate(0.04f);
		bank.bankInfo();
	}
}
