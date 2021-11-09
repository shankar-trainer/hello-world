package corg.capg;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.capg.model.onetoone_bi.Account;
import org.capg.model.onetoone_bi.Bank;

public class Bank_oonetoone_bi_Main {

	public static void main(String[] args) {

		Bank bank = new Bank();
		Account account = new Account();

		bank.setBankName("sbi");
		account.setAccountName("hanumath k");
		bank.setAccount(account);
		account.setBank(bank);

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(bank);
		
		//manager.persist(account);
		
		transaction.commit();

		transaction.begin();
		transaction.commit();

	}
}
