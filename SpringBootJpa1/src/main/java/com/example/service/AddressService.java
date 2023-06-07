package com.example.service;

import com.example.dao.AddressRepository;
import com.example.dao.PersonRepository;
import com.example.exception.AddressException;
import com.example.exception.PersonException;
import com.example.model.Address;
import com.example.model.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class AddressService {

    @Autowired
    AddressRepository repository;


    public Address addAddress(Address address) throws AddressException {
        Optional<Address> byId = repository.findById(address.getAddressId());
        if(byId.isPresent())
            throw new AddressException("id already present");
        else
            return repository.save(address);
    }


    public List<Address> getAllAddress() throws AddressException {
        List<Address> all = repository.findAll();
        if(all.size()==0)
            throw new AddressException("list is empty");
        else
            return  all;

    }

}
