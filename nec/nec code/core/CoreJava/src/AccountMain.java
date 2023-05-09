
public class AccountMain {

	public static void main(String[] args) {
		Account account=new SavingAccount(54545454, "chandan kumar", 20000,20,"mumbai");
		System.out.println("initial account information ");
		System.out.println(account);
	
		account.deposit(2000);
	
		System.out.println("\n after deposit of 2000 account information ");
		System.out.println(account);
		
		account.withdraw(800);
		
		System.out.println("\n after withdraw of 800 account information ");
		System.out.println(account);
		
		
	
	}
	
}
