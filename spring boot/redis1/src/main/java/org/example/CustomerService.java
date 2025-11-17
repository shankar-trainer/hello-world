package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
//import org.geeksforgeeks.RedisCRUD.entity.Customer;
//import org.geeksforgeeks.RedisCRUD.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

      // Injecting Repository into service class
    @Autowired 
      private CustomerRepo repo;

      // to insert new customer data into the Redis database
    public Customer addCustomer(Customer customer){

        return repo.save(customer);
    }

      // run a fetch query in the Redis Database
      // to get a list of all the customers
    public List<Customer> getAllCustomers(){

        List<Customer> allCustomer = new ArrayList<>();
        repo.findAll().forEach(allCustomer::add);
        return allCustomer;
    }

      // fetch operation to get customer using an ID
    public Customer getCustomerById(int id){

        Optional<Customer> optionalCustomer
            = repo.findById(String.valueOf(id));
        return optionalCustomer.orElse(null);
    }

      
      // update operation to existing customer using an ID
    public Customer updateCustomerById(int id,
                                       Customer newCustomer){
      
        Optional<Customer> existingCustomer
            = repo.findById(String.valueOf(id));

        if (existingCustomer.isPresent()) {
            Customer updatedCustomer
                = existingCustomer.get();

            updatedCustomer.setName(newCustomer.getName());
            updatedCustomer.setPhone(newCustomer.getPhone());
            updatedCustomer.setEmail(newCustomer.getEmail());

            repo.deleteById(String.valueOf(id));
            return repo.save(updatedCustomer);
        }

        return null;
    }

      // delete the existing customer
    public void deleteCustomerById(int id){
        repo.deleteById(String.valueOf(id));
    }
}