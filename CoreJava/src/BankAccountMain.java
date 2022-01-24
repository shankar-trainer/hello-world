
public class BankAccountMain {

	public static void main(String[] args) {
		//BankAccount bank_act=new BankAccount();
		  // abstract class cannot be instantiated 
		
		UserAccount account=new UserAccount();
		account.setAccountNo(75667677);
		account.setAccountName("sagar kumar");
		account.setAccountBalance(20000);
		account.setLocation("chennai");
		
		
		account.accountInfo();
		
		account.deposit(2000);
		System.out.println("after deposit balance is "+account.getAccountBalance());
		
		account.withdrawl(500);
		System.out.println("after withdraw balance is "+account.getAccountBalance());
		
		
	}
}
