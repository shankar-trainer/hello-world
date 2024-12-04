package com.example.repository;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends
        JpaRepository<Product,Integer> {

 public Product   findByproductName(String name);
 @Query("select p from Product p where p.productName=?1 and p.productId=?2")
 public Product   findByproductNameAndproductId(String name,int id);

 @Query("select p from Product p where p.productName=?1 and p.productCost=?2")
 public Product   findByproductNameAndproductCost(String name, float cost);


}
