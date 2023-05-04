package edu.chitraka;

public class AccountMain {
	public static void main(String[] args) {
		
		Customer customer=new Customer(2332556, "vijay chauhan", "vijay123@ymail.com");
		
		Account account=new SavingsAccount(4344334, customer, 5000);
		
		System.out.println("Customer Information ");
		System.out.println("\tid "+customer.getCustomerId());
		System.out.println("\tname "+customer.getCustomerName());
		System.out.println("\tmail id  "+customer.getEmailId());
	
		System.out.println("\nAccount Information ");
		System.out.println("\t account no "+account.accountNumber);
		System.out.println("\t account balance "+account.balance);
		
		System.out.println("withdraw 4000");
	   if(account.withdraw(4000)) {
		   System.out.println("account withdraw successful ");
		   System.out.println("balance is "+account.balance);
	   }
	   else 
		   System.out.println("account cannot be withdrawn ");
		   
	}
}
