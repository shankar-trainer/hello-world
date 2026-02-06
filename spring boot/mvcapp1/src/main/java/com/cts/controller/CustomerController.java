package com.cts.controller;

import com.cts.dao.CustomerDaoImpl;
import com.cts.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@ComponentScan("com.cts.dao")
public class CustomerController {

    @Autowired
    CustomerDaoImpl dao;

    @RequestMapping("/customer")
    public String welcome(Model model){
        Customer customer=new Customer();

        model.addAttribute("customer",customer);
        return  "customerform";
    }
    @PostMapping("customerAction")
    public String customerProcess(@Valid Customer customer,
                                  BindingResult result){
     if(result.hasErrors()){
         return  "customerform";
     }
    else {
             dao.addCustomer(customer);
         return "customerresult";
     }
    }
}
