
public class Account {

	private int accountId;  // instance variable
	private String  accountName;
	private float accountBalance;
	private static String  accountCountry ;// class/static variable , shared among objects  
	private static String  accountBank ;
	
	public Account(int accountId, String accountName, float accountBalance) {
		// constructor is used to initialize instance variable
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	static {// static block is used to initialize static/class members
	  System.out.println("static block");	
	  accountBank="sbi";
	  accountCountry="india";
	}
	
	public Account() {
	  System.out.println("constructor called");
	}
   
	public void accountInfo() {
		System.out.println("\nAccount information \n");
		System.out.println("Id is "+accountId);
		System.out.println("Name is "+accountName);
		System.out.println("Balance is "+accountBalance);
		System.out.println("Bank Name  is "+Account.accountBank);
		System.out.println("Country is "+Account.accountCountry);
	}
	
	public static  void accountInfo1(Account act) {
		System.out.println("\nAccount information \n");
		System.out.println("Id is "+act.accountId);
		System.out.println("Name is "+act.accountName);
		System.out.println("Balance is "+act.accountBalance);
		System.out.println("Bank Name  is "+Account.accountBank);
		System.out.println("Country is "+Account.accountCountry);
	}
	 
}
