package com.abc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.abc.model.Product;

import lombok.Data;

//@Repository
//@Data
public class ProductDaoImpl implements ProductDao {

	SessionFactory factory;
	Transaction transaction;
	Session session;

	public ProductDaoImpl(SessionFactory factory) {
		super();
		this.factory = factory;
		session = factory.openSession();
		transaction = session.getTransaction();
	}

	@Override
	public Product addProduct(Product p) {
		if (searchProduct(p.getIsbn()) == null) {
			transaction.begin();
			session.save(p);
			transaction.commit();
			return p;
		}
		return null;
	}

	@Override
	public Product searchProduct(long isbn) {
		Product product = session.find(Product.class, isbn);

		if (product != null)
			return product;
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		return session.createQuery("from Product").getResultList();
	}
}
