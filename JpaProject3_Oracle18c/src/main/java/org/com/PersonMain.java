package org.com;

import org.capg.model.Employee;
import org.capg.model.Gender;
import org.capg.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonMain {

    public static void main(String[] args) {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
        EntityManager manager = managerFactory.createEntityManager();

        Person person=new Person();
        person.setName("sita kumari");
        person.setId(677769);
        person.setGender(Gender.FEMALE);

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        //manager.persist(person);
        transaction.commit();
        System.out.println("Record added ");
        manager.createQuery("from Person").getResultList().forEach(System.out::println);
                //createQuery.getResultList();
    }
}