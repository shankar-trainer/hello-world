
public class AccountMain {

	public static void main(String[] args) {
		Account account1=new Account(544556, "kamal kumar", 12000);
		Account account2=new Account(544559, "vimal kumar", 18000);
		
		  // calling non static method accountInfo
		//account1.accountInfo();
		//account2.accountInfo();
		
		// calling  static method accountInfo1
		
		Account.accountInfo1(account1);
		Account.accountInfo1(account2);
		
	}
}
