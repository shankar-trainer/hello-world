package com.example.service;

import com.example.dao.AddressRepository;
import com.example.dao.MobileRepository;
import com.example.exception.AddressException;
import com.example.exception.MobileException;
import com.example.model.Address;
import com.example.model.Mobile;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class MobileService {

    @Autowired
    MobileRepository repository;


    public Mobile addMobile(Mobile mobile) throws MobileException {
        Optional<Mobile> byId = repository.findById(mobile.getMobileId());
        if(byId.isPresent())
            throw new MobileException("id already present");
        else
            return repository.save(mobile);
    }

    public List<Mobile> getAllMobiles() throws MobileException {
        List<Mobile> all = repository.findAll();
        if(all.size()==0)
            throw new MobileException("list is empty");
        else
            return  all;

    }

}
