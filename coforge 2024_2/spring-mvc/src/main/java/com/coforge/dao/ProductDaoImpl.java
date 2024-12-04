package com.coforge.dao;

import com.coforge.model.*;
import lombok.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;

import javax.transaction.*;
import java.util.*;

@Repository
@Data
@ComponentScan(basePackages = "com.coforge.config")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory factory;
	Session session;
//
//	//@Autowired
//	public ProductDaoImpl(SessionFactory factory) {
//		super();
//		this.factory = factory;
//	}

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