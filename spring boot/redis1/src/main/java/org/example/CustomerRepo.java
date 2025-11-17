package org.example;

// import org.geeksforgeeks.RedisCRUD.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,String> {
  
  // this interface will provide all basic operations for Customer Entity
  // To create a custom query you can define a method for that.
  
}