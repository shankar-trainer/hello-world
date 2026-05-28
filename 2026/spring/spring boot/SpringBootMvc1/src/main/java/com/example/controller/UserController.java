package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/form")
    public String userForm() {
        return "UserForm";
    }

    @RequestMapping("/userAction")
    public String userResult(@RequestParam("id") int id,
                             @RequestParam("name") String name,
                             @RequestParam("salary") float salary, ModelMap map) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSalary(salary);
        map.addAttribute("user",user);

        return "UserResult";
    }


}
