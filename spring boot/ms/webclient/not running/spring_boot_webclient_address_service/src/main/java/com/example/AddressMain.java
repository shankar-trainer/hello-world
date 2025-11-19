package com.example;

import com.example.entity.Address;
import com.example.repository.AddressRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AddressMain {

    public static void main(String[] args) {
        SpringApplication.run(AddressMain.class,args);
    }

    @Autowired
    private AddressRepo addressRepo;

    @PostConstruct
    public void add(){
        Address address[]=new Address []{
                new Address(1,"lucknow","UP"),
                new Address(2,"shimal","HP"),
                new Address(3,"bhopal","MP"),
                new Address(4,"amarabati","AP"),
        };
        addressRepo.saveAll(Arrays.asList(address));

        addressRepo.findAll().forEach(addr1 -> System.out.println(addr1));

    }

}
//http://localhost:8081/address-service/h2-console

