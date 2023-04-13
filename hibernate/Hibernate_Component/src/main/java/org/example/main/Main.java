package org.example.main;

import org.example.model.Kid;
import org.example.model.Toy;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by shankar on 4/5/2023.
 */
public class Main {

    public static void main(String[] args) {

        Session session =
                new Configuration().configure().buildSessionFactory().openSession();

        Transaction transaction = session.getTransaction();

        Kid kid=new Kid();
        kid.setKidAge(10);
        kid.setKidName("monu kumar");

        Toy toy=new Toy();
        toy.setToyId(1);
        toy.setToyCost(300);
        toy.setToyName("barbie doll");

        kid.setToy(toy);


        transaction.begin();
        session.save(kid);
        transaction.commit();



    }
}
