package com.coforge.controller;

import com.coforge.exception.*;
import com.coforge.model.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import javax.validation.*;

@Controller
@RequestMapping("/customer")
public class CustomerContoller {

    // phase 1
    //@RequestMapping("/customerForm")
    @GetMapping("/customerForm")
    public String getCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "CustomerForm";
    }

    @PostMapping("/customerAction")
    public String validateCustomer(@ModelAttribute("customer") @Valid Customer customer,
                                   BindingResult result) {
        if (result.hasErrors()) {
            return "CustomerForm";
        } else {
            return "CustomerSuccess";
        }
    }

}
