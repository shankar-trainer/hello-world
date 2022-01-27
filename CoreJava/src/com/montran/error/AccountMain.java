package com.montran.error;

public class AccountMain {

	public static void main(String[] args) {
		Account account=new Account();
		
		try {
			account.setActBalance(10000);
			account.setActName("ramesr kumar");
			account.setActId(10001);
			
			System.out.println("Account Information ");
			System.out.println(account.getActId());
			System.out.println(account.getActName());
			System.out.println(account.getActBalance());
			
			
		} catch (AccountException e) {
		  System.err.println(e.getMessage());
		}
		
	}
}
