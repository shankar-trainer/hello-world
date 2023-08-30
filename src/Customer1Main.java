
public class Customer1Main {

	public static void main(String[] args) {
		Customer1 customer1=new Customer1(10001, "amrendra kumar", "amrendra@ymail.com");
		SavingsAccount account=new SavingsAccount(566765, customer1, 12000, 2000);
		
		System.out.println("Customer Information ");
		System.out.println(customer1.getCustomerId()+"\t"+customer1.getCustomerName()+"\t"+customer1.getEmailId());
	
		System.out.println("accountNumber\tbalance\tminimumBalance");
		System.out.println(account.accountNumber+"\t"+account.balance+"\t"+account.minimumBalance);
		
		
		if(account.withdraw(20000))
			System.out.println("account withdrawn ");
		else 
			System.out.println("account cannot be withdrawn ");
		
		if(account.withdraw(8000)) {
			System.out.println("account withdrawn ");
		System.out.println("account information ");
		System.out.println("accountNumber\tbalance\tminimumBalance");
		System.out.println(account.accountNumber+"\t"+account.balance+"\t"+account.minimumBalance);
		}
		else 
			System.out.println("account cannot be withdrawn ");
		
		
	
	}
}
