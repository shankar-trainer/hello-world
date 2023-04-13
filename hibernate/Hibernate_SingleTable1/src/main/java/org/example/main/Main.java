package org.example.main;

import org.example.model.CashPayment;
import org.example.model.CreditCardPayment;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shankar on 4/6/2023.
 */
public class Main {
    public static void main(String[] args) {

        Session session = new Configuration().configure().buildSessionFactory().openSession();

        Transaction transaction = session.getTransaction();


        CashPayment cashPayment = new CashPayment(7878,10000.0f,"a kumar");

        CreditCardPayment cardPayment = new CreditCardPayment(677667,120000.0f,"sumit kumar");



        transaction.begin();
        session.save(cashPayment);
        session.save(cardPayment);

        transaction.commit();
    }
}
