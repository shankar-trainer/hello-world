package com.coforge.controller;

import com.coforge.model.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserContoller {

    @RequestMapping("/welcome")
    public String welcome() {
        return "UserForm";  //  returns the View -- WEB-INF/jsp/UserForm.jsp
    }

    @RequestMapping("/userAction")
    public String userService(@RequestParam("id") int id1, @RequestParam("name") String name,@RequestParam("salary") float salary1, ModelMap map
    ) {
        User user = new User();
        user.setId(id1);
        user.setName(name);
        user.setSalary(salary1);
        map.addAttribute("user",user);
        return "UserResult";
    }

}
