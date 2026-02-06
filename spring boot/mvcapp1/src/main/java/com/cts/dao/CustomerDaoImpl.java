package com.cts.dao;

import com.cts.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.cts.config")
public class CustomerDaoImpl implements CustomerDao {
    SessionFactory sessionFactory;
    Session session;
    Transaction transaction;

    @Autowired
    public CustomerDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.session = this.sessionFactory.openSession();
        this.transaction = session.getTransaction();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        transaction.begin();
        session.save(customer);
        transaction.commit();
        return customer;
    }

}
