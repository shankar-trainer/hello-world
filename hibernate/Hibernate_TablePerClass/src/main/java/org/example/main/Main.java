package org.example.main;

import org.example.model.CashPayment;
import org.example.model.CreditCardPayment;
import org.example.model.Payment;
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

        Payment payment = new Payment();

        payment.setPaymentId(1);
        payment.setPaymentAmt(10000);
        payment.setPaymentUserName("amit kumar");


        CashPayment cashPayment = new CashPayment();

        cashPayment.setPaymentId(2);
        cashPayment.setPaymentAmt(50000);
        cashPayment.setPaymentUserName("sumit kumar");

        CreditCardPayment cardPayment = new CreditCardPayment();

        cardPayment.setPaymentId(3);
        cardPayment.setPaymentAmt(90000);
        cardPayment.setPaymentUserName("suresh kumar");




        transaction.begin();
        session.save(cashPayment);
        session.save(cardPayment);
        session.save(payment);

        transaction.commit();
    }
}
