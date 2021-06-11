package com.cts.collection;

import java.util.Arrays;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount account[]=new BankAccount[3];

		account[0]=new BankAccount();
		account[0].setActNo(56076677);
		account[0].setName("suresh kumar");
		account[0].setBalance(12000);
		
		account[1]=new BankAccount();
		account[1].setActNo(56076671);
		account[1].setName("amandeep kumar");
		account[1].setBalance(11000);

		account[2]=new BankAccount();
		account[2].setActNo(56076678);
		account[2].setName("pankaj  kumar");
		account[2].setBalance(19000);
		
		Arrays.sort(account);
		
		for (BankAccount bankAccount : account) {
			System.out.println(bankAccount.getActNo()+"  "+bankAccount.getBalance()+" "+bankAccount.getName());
		}
		
		
	}
}
