package com.cofoge.web;

import com.cofoge.model.Customer;
import com.cofoge.model.CustomerDTO;
import com.cofoge.model.CustomerMapper;
import com.cofoge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerMapper mapper;

    /*@PostMapping("/customer")
    public Customer addCustomer(@RequestBody CustomerDTO dto) {
        return repository.save(mapper.dtoToEntity(dto));
    }*/

    @PostMapping("/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody CustomerDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(mapper.dtoToEntity(dto)));
      }

    @GetMapping("/customer")
    public ResponseEntity<List<?>> showAllCustomer() {
        List<Customer> all = repository.findAll();
        if (all.isEmpty()) {
//         return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("list is empty"));
        } else {
            List<CustomerDTO> customerDTOList = new ArrayList<>();

            for (Customer c : all) {
                customerDTOList.add(mapper.entityToDTO(c));
            }
            return ResponseEntity.status(HttpStatus.FOUND).body(customerDTOList);
        }
    }
    /*@GetMapping("/customer")
    public List<CustomerDTO> showAllCustomer() {
        List<Customer> all = repository.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();

        for (Customer c : all) {
            customerDTOList.add(mapper.entityToDTO(c));
        }
        return customerDTOList;
    }*/


}
