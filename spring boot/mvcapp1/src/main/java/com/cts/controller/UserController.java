package com.cts.controller;

import com.cts.exception.UserException;
import com.cts.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return  "welcome";
    }

    @RequestMapping("/uaction")
    public String userAction(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap map) throws UserException {

        User user=new User();
        if(id<0)
            throw new UserException("invalid id");
        else if(name.isEmpty())
            throw new UserException("invalid name");
        else {
            user.setId(id);
            user.setName(name);
            map.addAttribute("user", user);
        }
        return  "result";
    }


    @ExceptionHandler(Exception.class)
    public String errorHandle(){
        return  "error1";
    }

 @ExceptionHandler(UserException.class)
    public String errorHandle1(){
        return  "error1";
    }


}
