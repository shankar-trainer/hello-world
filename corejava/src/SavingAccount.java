
public class SavingAccount  extends Account{

	public static void main(String[] args) {
		SavingAccount account=new SavingAccount();
		account.setId(10001);
		account.setName("ram bahadur");
		account.setBalance(20000);
		
		System.out.println("account information");
		System.out.println("\taccount id "+account.getId());
		System.out.println("\taccount name "+account.getName());
		System.out.println("\taccount balance "+account.getBalance());
		
		account.deposit(1200);
		System.out.println("\tafter deposit account balance "+account.getBalance());
		
		
		account.withdraw(700);
		System.out.println("\tafter withdraw account balance "+account.getBalance());
		
	}
}
