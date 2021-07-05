package org.cognizant.error;

public class AccountMain {

	public static void main(String[] args) {
		Account account=new Account();
		try {
			//account.setActId(-878778);
			account.setActId(878778);
			//account.setActName("");
			account.setActName("suresh kumar");
			account.setActBalance(900);
			
			System.out.println("Account Information");
			System.out.println("Account Id   "+account.getActId());
			System.out.println("Account Name   "+account.getActName());
			System.out.println("Account balance   "+account.getActBalance());
			
		} catch (AccountException e) {
			System.err.println(e.getMessage());
		}
	}
}
