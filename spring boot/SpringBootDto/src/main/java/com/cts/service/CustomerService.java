package com.cts.service;

import com.cts.dto.CustomerDTO;
import com.cts.exception.CustomerException;
import com.cts.mapper.DTOMapper;
import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    DTOMapper dtoMapper;

//        @Autowired
//    public CustomerService(CustomerRepository customerRepository, DTOMapper dtoMapper) {
//        this.customerRepository = customerRepository;
//        this.dtoMapper = dtoMapper;
//    }

    public CustomerDTO addCustomer(CustomerDTO dto) {
        if (dtoMapper == null)
            log.info("dtoMapper is null ......");
        Customer customer = dtoMapper.dtoToEntity(dto);
        log.info("adding  customer " + customer);

        Customer customer1 = customerRepository.save(customer);
        log.info("added customer1 " + customer1);
        return dtoMapper.entityToCustomerDTO(customer1);
    }

    public List<CustomerDTO> getAllCustomer() {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        if (customerRepository.findAll().size() == 0)
            throw new CustomerException("list is empty");

        for (Customer c : customerRepository.findAll()) {
            CustomerDTO dto = dtoMapper.entityToCustomerDTO(c);
            customerDTOList.add(dto);
        }
        return customerDTOList;
    }

    public List<Customer> getAllCustomer1() {
        if (customerRepository.findAll().size() == 0)
            throw new CustomerException("list is empty");
        return customerRepository.findAll();
    }

}
