package com.cts.controller;

import com.cts.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CustomerController {
    @RequestMapping("/hello")
    public String hello() {
        return "customer";
    }

    @RequestMapping(value = "/customerAction", method = RequestMethod.POST)
//    public ModelAndView customerService1(@RequestParam("id") int id1, @RequestParam("name") String name, @RequestParam("salary") float salary1, ModelMap map
//    )
    public String customerService1(@RequestParam("id") int id1, @RequestParam("name") String name, ModelMap map
    ) {
        Customer customer = new Customer();
//        if(id1<=0)
//            throw new UserException("id is blank");
//        else if(name.isBlank())
//            throw new UserException("name is blank");
//        else if(salary1<=0)
//            throw new UserException("invalid salary");
//        else {
        customer.setId(id1);
        customer.setName(name);
        map.addAttribute("customer", customer);
//            ModelAndView modelAndView = new ModelAndView("CustomerResult", map);
//            return modelAndView;
        return "result";
    }
}


