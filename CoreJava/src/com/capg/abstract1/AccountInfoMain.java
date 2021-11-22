package com.capg.abstract1;

import java.util.Date;

public class AccountInfoMain {

	public static void main(String[] args) {
		AccountInfo accountInfo = new AccountInfo();

		accountInfo.setAccountNo(67676);
		accountInfo.setAccountName("surendra kumar");
		accountInfo.setAccountOpen(new Date());
		accountInfo.setBalance(12000);
		accountInfo.setLocation("madurai");

		System.out.println("account no " + accountInfo.getAccountNo());
		System.out.println("account holder name " + accountInfo.getAccountName());
		System.out.println("open date " + accountInfo.getAccountOpen());
		System.out.println("balance " + accountInfo.getBalance());
		System.out.println("location " + accountInfo.getLocation());

	}
}
