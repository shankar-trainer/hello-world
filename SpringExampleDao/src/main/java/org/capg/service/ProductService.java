package org.capg.service;

import java.util.List;

import org.capg.dao.ProductDao;
import org.capg.exception.ProductNotFoundException;
import org.capg.model.Product;

public class ProductService {

	private ProductDao dao;

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	public ProductService() {
		dao = new ProductDao();
	}

	public boolean findProduct(Product prd) {
		if (!dao.searchProduct(prd))
			throw new ProductNotFoundException("product not found");
		else
			return dao.searchProduct(prd);
	}

	public boolean saveProduct(Product prd) {
		if (!dao.searchProduct(prd))
			return dao.addProduct(prd);
		else
			throw new ProductNotFoundException("product not present");
	}

	public boolean removeProduct(Product prd) {
		if (dao.searchProduct(prd))
			return dao.deleteProduct(prd);
		else
			throw new ProductNotFoundException("product not present");
	}

	public List<Product> showAllProduct() {
		if (dao.getAllProduct().size() == 0)
			throw new ProductNotFoundException("product list is empty");
		else
			return dao.getAllProduct();
	}

}
