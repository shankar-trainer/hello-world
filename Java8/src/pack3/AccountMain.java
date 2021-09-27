package pack3;

public class AccountMain {

	public static void main(String[] args) {
		Account account;
		
		account=new SavingAccount();
		System.out.println("\n**************Saving Account******************** ");
		account.accountOpen();
		
		account.setActId(76677667);
		account.setActName("saumes kumar");
		account.setActBalance(12000);
		System.out.println(account);
		account.deposit(2000);
		System.out.println("After deposit balance is "+account.getActBalance());
		account.withdraw(200.0f);
		System.out.println("After withdraw balance is "+account.getActBalance());
		account.accountClose();
		
		
		account=new CurrentAccount();
		System.out.println("\n**************Current Account******************** ");
		account.accountOpen();
		
		account.setActId(76677661);
		account.setActName("amar anand");
		account.setActBalance(18000);
		
		System.out.println(account);
		account.deposit(5000);
		System.out.println("After deposit balance is "+account.getActBalance());
		account.withdraw(1200.0f);
		System.out.println("After withdraw balance is "+account.getActBalance());
		account.accountClose();
		
		
		
		account=new CorporateAccount();
		System.out.println("\n**************Corporate Account******************** ");
		account.accountOpen();
		
		account.setActId(76677660);
		account.setActName("jatin anand");
		account.setActBalance(22000);
		
		System.out.println(account);
		account.deposit(8000);
		System.out.println("After deposit balance is "+account.getActBalance());
		account.withdraw(400.0f);
		System.out.println("After withdraw balance is "+account.getActBalance());
		account.accountClose();
		
	}
}
