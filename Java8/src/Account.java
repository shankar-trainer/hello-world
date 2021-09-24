
public class Account {

	private int accountId;  //instance variable 
	private String accountName;//instance variable
	private float accountBalance;//instance variable

	  // static members are common members  , single copy is shared by all objects 
	private static float interestRate; // static member  class variable 
	
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	public static void setCountry(String country) {
		Account.country = country;
	}

	private static String country;// static member  class variable 

	  
	static {
		System.out.println("static block called ");
		interestRate = 0.05f;
		country = "india";
	}

	static void Info() {
		System.out.println("information");
	}
	public  void accountInfo() {
		System.out.println("\naccount information  ");
		System.out.println("account id "+accountId);
		System.out.println("account name "+accountName);
		System.out.println("account balance "+accountBalance);

		System.out.println("\n\tcountry is " + Account.country);
		System.out.println("\tinterest rate is " + Account.interestRate);
	}
	
	public Account() {
        accountId=988998;		
        accountName="suresh mohan";
        accountBalance=12000;
        accountId=988998;		
		System.out.println("constructor called ");
	}
	
	public Account(int accountId, String accountName, float accountBalance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

}
