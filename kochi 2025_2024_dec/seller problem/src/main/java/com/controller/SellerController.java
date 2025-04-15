package com.controller;

import com.bean.Seller;
import com.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SellerController {

    @Autowired
    SellerRepository sellerRepository;

    @GetMapping("/seller")
    public List<Seller> getSellers(){
        return  sellerRepository.findAll();
    }
}
