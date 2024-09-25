package com.coforge.controller;

import com.coforge.exception.*;
import com.coforge.model.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {

    // phase 1
    //@RequestMapping("/customerForm")
    @GetMapping("/customerForm")
    public String getCustomer(Model model ){
        model.addAttribute("customer",new Customer());
        return  "CustomerForm";
    }

}
