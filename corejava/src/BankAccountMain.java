
public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount account1=new BankAccount(323233, "arvind kumar", "deposit", 1200, 10000);
		
		BankAccount account2=new BankAccount(323235, "surendra kumar", "withdraw", 1000, 17000);
		
		
		System.out.println("\naccount 1 information\n");
		System.out.println("\taccount no "+account1.getAccountNo());
		System.out.println("\tname "+account1.getCustomerName());
		System.out.println("\tstarting account  balance  "+account1.getBalanace());
		System.out.println("\ttransaction type "+account1.getTransactionType());
		System.out.println("\ttransaction amount "+account1.getTran_amount());
		account1.transaction();
		System.out.println("\tafter transaction  account  balance  "+account1.getBalanace());

		System.out.println("\naccount 2 information\n");
		System.out.println("\taccount no "+account2.getAccountNo());
		System.out.println("\tname "+account2.getCustomerName());
		System.out.println("\tstarting account  balance  "+account2.getBalanace());
		System.out.println("\ttransaction type "+account2.getTransactionType());
		System.out.println("\ttransaction amount "+account2.getTran_amount());
		account2.transaction();
		System.out.println("\tafter transaction  account  balance  "+account2.getBalanace());
		
		
		
	}
}
