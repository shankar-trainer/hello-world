package com.cts.mapper;

import com.cts.dto.CustomerDTO;
import com.cts.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DTOMapper {
    public Customer dtoToEntity(CustomerDTO dto){
               Customer customer=new Customer();
               customer.setName(dto.getName());
               customer.setSalary(dto.getSalary());
               return  customer;
    }
    public CustomerDTO entityToCustomerDTO(Customer customer){
        log.info("dtomapper "+customer);
        CustomerDTO dto=new CustomerDTO();
        dto.setName(customer.getName());
        dto.setSalary(customer.getSalary());
        log.info("dtomapper return dto "+dto);

        return  dto;
    }

}
