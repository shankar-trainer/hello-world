package com.abc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.abc.model.Product;

import lombok.Data;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement
//@Repository
//@Data
public class ProductDaoImpl1 implements ProductDao {

	SessionFactory factory;
	Session session;

	public ProductDaoImpl1(SessionFactory factory) {
		super();
		this.factory = factory;
//		session = factory.getCurrentSession();
	}

	@Transactional
	@Override
	public Product addProduct(Product p) {
		//Session session=factory.openSession();
		//if (searchProduct(p.getIsbn()) == null) {
		session = factory.getCurrentSession();
		session.save(p);
			return p;
		//}
		//return null;
	}

	@Override
	public Product searchProduct(long isbn) {
		session = factory.getCurrentSession();
		Product product = session.find(Product.class, isbn);

		if (product != null)
			return product;

		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		session = factory.getCurrentSession();
		return session.createQuery("from Product").getResultList();

	}

}
