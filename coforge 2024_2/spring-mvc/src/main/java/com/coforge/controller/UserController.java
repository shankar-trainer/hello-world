package com.coforge.controller;

import com.coforge.dao.ProductDao;
import com.coforge.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/user")
@ComponentScan(basePackages = {"com.coforge.dao"})
public class UserController {

    @Autowired
    ProductDao dao;

    @RequestMapping("/form")
    public String welcome(ModelMap modelMap){

        modelMap.addAttribute("list",Arrays.asList(dao.getAllProduct()));

        return "UserForm";
    }


}