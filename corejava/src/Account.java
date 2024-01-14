
public class Account {

	int accountId; // instance variable
	String accountName;
	float balance;
	public Account() {
	   this.accountId=78787;
	   this.accountName="amrit kumar";
	   this.balance=67000f;
	}
	static float interest_rate=4.5f;// class variable 
	static String country="india"	;
	public static void main(String[] args) {
	
		System.out.println("Interest rate "+interest_rate);
		System.out.println("Interest rate "+country);
		System.out.println("Interest rate "+Account.country);
		
		Account account=new Account();
		
		System.out.println("Account id "+account.accountId);
		System.out.println("Account name "+account.accountName);
		System.out.println("Account balance "+account.balance);
		
		
	}
}
