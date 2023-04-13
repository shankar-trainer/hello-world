package org.example.main;

import org.example.model.Survey;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by shankar on 4/7/2023.
 */
public class Main {

    public static void main(String[] args) {

        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction transaction =
                session.getTransaction();

        Survey survey=new Survey(233221,"corruption","delhi", LocalDate.of(2023,10,21), LocalTime.of(9,10));

        transaction.begin();
        session.save(survey);

        transaction.commit();
    }

}
