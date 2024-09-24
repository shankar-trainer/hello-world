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

public class UserMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory= HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();
        Transaction transaction=session.getTransaction();

        User user=new User();
        user.setName("ram kumar");

        Address address=new Address();
        address.setLocation("noida");
        address.setState("UP");

        user.setAddress(address);

        Book book[]=new Book[3];
        Set<Book> bookset=new HashSet<>();
        for (int i = 0; i <book.length ; i++) {
            book[i]=new Book();
            book[i].setBname(Data.bname[i]);
            bookset.add(book[i]);
        }
        //user.setBookSet(bookset);

        transaction.begin();
       // session.save(address);
        session.save(user);
        transaction.commit();

        System.out.println("user and address added ");

        List<User> fromUser = session.createQuery("from User").list();

        fromUser.forEach(System.out::println);

    }
}
