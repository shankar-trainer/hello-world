package com.cofoge.model;

import org.springframework.stereotype.Component;
@Component
public class CustomerMapper {
    public CustomerDTO entityToDTO(Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerName(customer.getCustomerName());
        customerDTO.setCustomerAge(customer.getCustomerAge());
        return customerDTO;
    }
    public Customer dtoToEntity(CustomerDTO dto) {
        Customer customer = new Customer();
        customer.setCustomerId(dto.getCustomerId());
        customer.setCustomerName(dto.getCustomerName());
        customer.setCustomerAge(dto.getCustomerAge());
        return customer;
    }

}
