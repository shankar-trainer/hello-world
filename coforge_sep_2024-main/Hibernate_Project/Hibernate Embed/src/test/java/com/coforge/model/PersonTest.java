package com.coforge.model;

import com.coforge.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonTest {
    SessionFactory sessionFactory;
    Session session;
    Transaction transaction;

    Phone phone;
    Car car[];

    @BeforeEach
    public void init(){
       sessionFactory= HibernateSessionFactory.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.getTransaction();
        phone=Phone.builder().phoneCost(45000).phoneModel("nokia").build();
        car=new Car[4];
    }

    @Test
   public void  test1(){
        car[0]=Car.builder().carModel("thar").carCost(1500000).build();
        car[1]=Car.builder().carModel("maruti swift").carCost(500000).build();
        car[2]=Car.builder().carModel("celario").carCost(800000).build();
        car[3]=Car.builder().carModel("corolla").carCost(1200000).build();

        Set<Car> collect = Stream.of(car).collect(Collectors.toSet());

        Person person=Person.builder().name("kamal kumar").phone(phone).carSet(collect).build();
        transaction.begin();
        session.save(person);
        transaction.commit();

        Assertions.assertEquals(person.getName(),"kamal kumar");
        Assertions.assertEquals(person.getPhone(),phone);
        Assertions.assertEquals(person.getCarSet(),collect);
        Assertions.assertEquals(4,person.getCarSet().size());
        }
}
