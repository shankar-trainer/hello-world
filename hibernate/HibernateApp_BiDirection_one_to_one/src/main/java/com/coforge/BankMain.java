package com.coforge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.model.Account;
import com.coforge.model.Bank;
import com.coforge.util.MySessionFactory;

public class BankMain {
	public static void main(String[] args) {
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();
		
		Account account = new Account();

		Bank bank = new Bank();

		account.setAccountName("amit kumar");
		account.setAccountBalance(20000);

		bank.setBankName("muthu bank");
		bank.setBankLocation("vinod nagar");
		
//		bank.setAccount(account);
//		
//		transaction.begin();
//		session.save(bank);
//		transaction.commit();
		
		account.setBank(bank);
		bank.setAccount(account);
		
		transaction.begin();
		session.save(account);
		transaction.commit();
		
	}
}
