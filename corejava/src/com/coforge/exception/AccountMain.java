package com.coforge.exception;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account=new Account();
		try {
			account.setAccountId(5001);
			account.setAccountName("ram kumar");
			account.setBalance(9080);

			System.out.println("Account Information");

			System.out.println("\t account id "+account.getAccountId());
			System.out.println("\t account name "+account.getAccountName());
			System.out.println("\t account balance "+account.getBalance());
			
		
		} catch (Exception e) {
		
			System.err.println(e.getMessage());
		}
		
		
		}
}
