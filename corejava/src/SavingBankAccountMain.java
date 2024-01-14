
public class SavingBankAccountMain {

	public static void main(String[] args) {
		
		SavingBankAccount account=new SavingBankAccount(5000, 4.5f);
		
		account.setUserId(676767);
		account.setUserName("suresh kumar");
		account.setUserAge(34);
		
		System.out.println("Saving Bank Account Information");
		System.out.println("\n User Info");
		
		account.bankUserInfo();
		
		System.out.println("\n Bank account information");

		account.bankAccountInfo();
		
		account.deposit(1000);
		account.withdraw(100);
		
		System.out.println("\n account balance "+account.getAmt());
		
	}
}
