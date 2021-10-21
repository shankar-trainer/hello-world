package com.example.controller;


import com.example.dao.CustomerDao1;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class CustomerController1 {

    //@RequestMapping("/cstLogin")

    @RequestMapping(value = "/cstLogin", method = RequestMethod.GET)
    public String customerLogin(ModelMap map) {

        Customer customer = new Customer();
        customer.setId(1230);
        customer.setName("ram kumar");
        customer.setSalary(34000.0f);
        customer.setSsn("custr4576767");
        customer.setEmail("ramkumar@gmail.com");
        map.addAttribute("customer", customer);
        return "CustomerLoginForm";
    }

    @Autowired
    CustomerDao1 dao;

    @RequestMapping(value = "/cstLogin", method = RequestMethod.POST)
    public String customerValidate(@ModelAttribute("customer") @Valid Customer customer, BindingResult result,
                                   @RequestParam("operation") String operation, ModelMap map) {

        map.addAttribute("operation", operation);
        if (result.hasErrors())
            return "CustomerLoginForm";
        else {
            if (operation.equals("Add Customer")) {
                if (dao.searchCustomer(customer)==null) {
                    //if (!dao.findById(customer.getId()).isPresent()) {
                    dao.addCustomer(customer);
                    map.addAttribute("message", "Record Added");
                } else {
                    map.addAttribute("message", "Record Already Present");
                }
            } else if (operation.equals("ShowAll Customer")) {
                List<Customer> CustomerList = dao.showAllCustomer();
                //List<Customer> CustomerList = dao.findAll();
                map.remove("message");
                map.addAttribute("message", "All Customer Record<br>");
                map.addAttribute("CustomerList", CustomerList);
            } else if (operation.equals("Search Customer")) {
//				Customer searchCustomer = dao.searchCustomer(customer);
                if (dao.searchCustomer(customer) != null)
                //if (dao.findById(customer.getId()).isPresent())
                {

                    map.remove("message");
                    map.addAttribute("message", "Customer Found<br>");
                    map.addAttribute("customer", customer);
                } else {
                    map.remove("message");
                    map.addAttribute("message", "Customer Not Found");
                }
            }
            return "CustomerInfo";
        }
    }
}