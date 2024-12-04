package com.coforge.controller;

import com.coforge.exception.*;
import com.coforge.model.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import javax.validation.*;
import java.util.Arrays;
import java.util.List;

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
    @ModelAttribute("gender")
    public List<String> getGender(){
        return Arrays.asList(new String[]{"male","female"});
    }
    @ModelAttribute("hobby")
    public List<String> getHobbies(){
        return Arrays.asList(new String[]{"music","movie","shopping","touring","flowering"});
    }
    @ModelAttribute("cities")
    public List<String> getCities(){
        return Arrays.asList(new String[]{"new delhi","aagra","mathura","gurgaon","faridabad","kolkotta"});
    }

}
