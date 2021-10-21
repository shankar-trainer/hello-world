package org.com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.com.capgemini.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public boolean storeProduct(Product prd) {
		// TODO Auto-generated method stub
		if(searchProduct(prd)==null)
		{
			entityManager.persist(prd);
			
			return true;
		}
		return false;
	
	}

	@Transactional(readOnly = true)
	public Product searchProduct(Product prd) {
		// TODO Auto-generated method stub
		
		return entityManager.find(Product.class , prd.getPrd_id());
	}

	@Transactional
	public boolean removeProduct(Product prd) {
		// TODO Auto-generated method stub
		if(searchProduct(prd)!=null)
		{
			entityManager.remove(prd);
			return true;
		}
		return false;
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select p from Product p").getResultList();
	}

}
