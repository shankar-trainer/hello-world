
public class SavingAccountMain {

	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount(554554,"s kumar", 7000, 5, 10, "chennai");
		
		System.out.println("Saving account information ");
		System.out.println(savingAccount.getAccountId());
		System.out.println(savingAccount.getAccountName());
		System.out.println(savingAccount.getAccountBalance());
		System.out.println(savingAccount.getTime());
		System.out.println(savingAccount.getLocation());
		System.out.println(savingAccount.getInterestRate());
		
		System.out.println("Interest is "+savingAccount.interestcalc());
		
	}
}
