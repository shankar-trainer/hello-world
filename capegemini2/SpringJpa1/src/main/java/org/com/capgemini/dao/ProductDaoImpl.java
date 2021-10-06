package org.com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.com.capgemini.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
//@EnableTransactionManagement(proxyTargetClass = true)

public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public boolean storeProduct(Product prd) {
		if (searchProduct(prd) == null) {
			entityManager.persist(prd);
			return true;
		}
		return false;
	}

	@Transactional(readOnly = true)
	public Product searchProduct(Product prd) {
		return entityManager.find(Product.class, prd.getPrd_id());
	}

	@Transactional
	public boolean removeProduct(Product prd) {
		if (searchProduct(prd) != null) {
			if (entityManager.contains(prd))
				entityManager.remove(prd);
			else
				entityManager.merge(prd);
			return true;
		}
		return false;
	}

	public List<Product> getAllProduct() {
		return entityManager.createQuery("select p from Product p").getResultList();
	}

}
