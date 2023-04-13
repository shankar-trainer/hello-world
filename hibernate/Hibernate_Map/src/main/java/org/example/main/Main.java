package org.example.main;

import org.example.model.Bus;
import org.example.model.Passenger;
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

        Passenger passenger=new Passenger(6556656,"ram kumar",30);

        Map<Integer,Passenger> map1=new HashMap<Integer, Passenger>();
        map1.put(6556656,passenger);

        Bus bus=new Bus(787878,"dtc","laxminagar to uttamnagar",100,map1);
        transaction.begin();
        session.save(bus);

        transaction.commit();
    }
}
