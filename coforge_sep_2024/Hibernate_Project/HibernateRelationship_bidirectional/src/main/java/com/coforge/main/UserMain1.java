package com.coforge.main;

import com.coforge.data.Data;
import com.coforge.model.Address;
import com.coforge.model.Book;
import com.coforge.model.User;
import com.coforge.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Bidirectional
public class UserMain1 {
    public static void main(String[] args) {

        SessionFactory sessionFactory= HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();
        Transaction transaction=session.getTransaction();

        User user=new User();
        user.setName("suresh kumar");

        Address address=new Address();
        address.setState("haryana");
        address.setLocation("gurgaon");

        address.setUser(user);
        user.setAddress(address);

        Book book[]=new Book[3];

        for (int i = 0; i <book.length ; i++) {
            book[i] = new Book();
            book[i].setBname(Data.bname[i]);
            book[i].setUser(user);
        }

        for(Book b:book)
        {
            transaction.begin();
            session.save(b);
            transaction.commit();
        }

        transaction.begin();
        session.save(address);
        transaction.commit();
    }
}
