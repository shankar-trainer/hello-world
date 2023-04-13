package com.example.dao;

import com.example.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by shankar on 3/31/2023.
 */
public class ProductDao {
    SessionFactory sessionFactory;
    Session session,session1;
    Configuration configuration;
    Transaction tr;

    public ProductDao() {
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        tr = session.getTransaction();
    }

    public boolean addProduct(Product p) {

        if (searchProduct(p.getPrdId()) == null) {
            tr.begin();
            session.save(p);
            tr.commit();
            return true;
        }
        return false;
    }

    public boolean updateProduct(Product p) {

        if (searchProduct(p.getPrdId()) != null) {
            session1 = sessionFactory.openSession();

            tr = session1.getTransaction();

            tr.begin();
            session1.update(p);
            tr.commit();
            return true;
        }
        return false;
    }

    public Product searchProduct(int prdid) {
        Product product = session.get(Product.class, prdid);
        return product;
    }


    public void deleteProduct(int prdid) {
        if (searchProduct(prdid) == null)
            System.out.println("product not present in the database");
        else {
            Product p = searchProduct(prdid);
            tr.begin();

            session.delete(p);
            tr.commit();

            System.out.println("product deleted with id " + prdid);
        }
    }


    public List<Product> getAllProduct() {
        return session.createQuery("from Product").list();
    }
}