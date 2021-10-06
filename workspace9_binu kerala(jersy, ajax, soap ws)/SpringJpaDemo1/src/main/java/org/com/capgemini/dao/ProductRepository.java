package org.com.capgemini.dao;

import org.com.capgemini.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
