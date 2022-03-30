package com.capg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.bean.inheritance.tableperconcreteclass.Card;
import com.capg.bean.inheritance.tableperconcreteclass.CreditCard;
import com.capg.bean.inheritance.tableperconcreteclass.DebitCard;

public class tablePerConcreeteClass_CardMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
		
		CreditCard creditCard=new CreditCard();
		DebitCard debitCard=new DebitCard();
		Card card=new Card();
		
		card.setBalance(1000);
		card.setPayment("by cheque payment");
		
		creditCard.setBalance(10000);
		creditCard.setPayment("by online credit card payment");
		creditCard.setLimit(30000);
		
		debitCard.setBalance(90000);
		debitCard.setPayment("by cash payment");
		debitCard.setState("delhi");
		
		transaction.begin();
		em.persist(creditCard);
		em.persist(card);
		em.persist(debitCard);
		transaction.commit();
		
	}
}
