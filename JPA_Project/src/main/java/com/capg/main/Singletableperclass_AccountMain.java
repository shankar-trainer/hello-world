package com.capg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.bean.inheritance.singletableperclass.CurrentAccount;
import com.capg.bean.inheritance.singletableperclass.SavingAccount;

public class Singletableperclass_AccountMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		
		SavingAccount account1=new SavingAccount();
		
		CurrentAccount account2=new CurrentAccount();
		account1.setActName("surendra account");
		account1.setActBalance(10000);
		
		account2.setActName("chandan account");
		account2.setActBalance(90000);
	
    transaction.begin();
    em.persist(account1);
    em.persist(account2);
    transaction.commit();
    
		
	}
}
