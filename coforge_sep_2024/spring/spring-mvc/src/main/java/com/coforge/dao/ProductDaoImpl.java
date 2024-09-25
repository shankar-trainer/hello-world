package com.coforge.dao;

import com.coforge.model.*;
import lombok.*;
import org.hibernate.*;
import org.springframework.stereotype.*;

import javax.transaction.*;
import java.util.*;

@Repository
@Data
public class ProductDaoImpl implements ProductDao {

	SessionFactory factory;
	Session session,session2;

	public ProductDaoImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	@Transactional
	@Override
	public Product addProduct(Product p) {
		session = factory.getCurrentSession();
		if (searchProduct(p.getIsbn()) == null) {
			session.save(p);
			return p;
		}
		return null;
	}

	@Override
	public Product searchProduct(long isbn) {
		session2 = factory.openSession();
		Product product = session2.find(Product.class, isbn);

		if (product != null)
			return product;

		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		session2 = factory.openSession();
		return session2.createQuery("from Product").getResultList();
	}

}