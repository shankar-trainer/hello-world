
public class bank_SB_AccountMain {

	public static void main(String[] args) {
		
		Bank_SB_Account account=new Bank_SB_Account(12122,"Raj","deposit",7000,25000 );
		
		System.out.println("Account No "+account.acct_no);
		System.out.println("Customer Name "+account.customer_name);
		System.out.println("Transaction Type "+account.trans_type);
		System.out.println("Transaction Amount "+account.trans_amount);
		System.out.println("Balance Amount "+account.bal_amount);
		
		account.transaction();
		
		System.out.println("New Balance Amount "+account.bal_amount);
	}
}
