package corg.capg;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.capg.model.onetoone_bi.Account;
import org.capg.model.onetoone_bi.Bank;
import org.capg.model.onetoone_bi.BankAddress;

public class Bank_oonetoone_bi_Main {

	public static void main(String[] args) {

		Bank bank = new Bank();
		Account account = new Account();

		bank.setBankName("sbi");
		account.setAccountName("hanumath k");
		bank.setAccount(account);

		Bank bank1 = new Bank();
		Account account1 = new Account();

		bank1.setBankName("pnb");
		account1.setAccountName("sri vidya");
		account1.setBank(bank1);

		Set<BankAddress> set_addresses = new HashSet<>();

		BankAddress bankAddress1 = new BankAddress();
		BankAddress bankAddress2 = new BankAddress();
		BankAddress bankAddress3 = new BankAddress();
		
		bankAddress1.setAddressState("tamil nadu");
		bankAddress1.setAddressCity("chennai");
		
		bankAddress2.setAddressState("laxminagar");
		bankAddress2.setAddressCity("new delhi");
		
		bankAddress3.setAddressState("andhra pardesh");
		bankAddress3.setAddressCity("vijaybara");
		set_addresses.add(bankAddress1);
		set_addresses.add(bankAddress2);
		set_addresses.add(bankAddress3);
		
		bank.setSet_bankAddress(set_addresses);

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(bank);
		
		manager.persist(bankAddress1);
		manager.persist(bankAddress2);
		manager.persist(bankAddress3);
		
		manager.persist(account);
		
		transaction.commit();

		transaction.begin();
		manager.persist(account1);
		manager.persist(bank1);
		transaction.commit();

	}
}
