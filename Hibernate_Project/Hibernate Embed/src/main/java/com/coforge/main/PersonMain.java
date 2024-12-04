package com.coforge.main;

import com.coforge.model.*;
import com.coforge.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        Phone phone= Phone.builder().phoneCost(45000).phoneModel("nokia").build();


        Car car[]=new Car[4];
        car[0]=Car.builder().carModel("thar").carCost(1500000).build();
        car[1]=Car.builder().carModel("maruti swift").carCost(500000).build();
        car[2]=Car.builder().carModel("celario").carCost(800000).build();
        car[3]=Car.builder().carModel("corolla").carCost(1200000).build();

        Set<Car> collect = Stream.of(car).collect(Collectors.toSet());
        //person.setCarSet(collect);
        Person person=Person.builder().name("kamal kumar").phone(phone).carSet(collect).build();
        transaction.begin();
        session.save(person);
        transaction.commit();

        session.createQuery("from Person").getResultList().forEach(System.out::println);
    }
}
