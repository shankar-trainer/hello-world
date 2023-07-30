package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

import java.util.List;

@Repository
public class ProductDao {

	private SessionFactory factory;

	public ProductDao(SessionFactory factory) {
		this.factory = factory;
	}

	public Product addProduct(Product prd) {

		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		if (searchProduct(prd.getPrdId()) == null) {
			transaction.begin();
			session.save(prd);
			transaction.commit();
			return prd;
		}
		return null;
	}

	public List<Product> findAllProduct() {
		Session session = factory.openSession();
	 return  session.createQuery("from Product").list();
	}

		public Product searchProduct(int id) {

		Session session = factory.openSession();
		Product find = session.find(Product.class, id);
		if (find == null)
			return null;
		else
			return find;

	}

}
