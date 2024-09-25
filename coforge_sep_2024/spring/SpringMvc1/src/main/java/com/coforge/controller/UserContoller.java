package com.coforge.controller;

import com.coforge.exception.*;
import com.coforge.model.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import javax.validation.*;

@Controller
@RequestMapping("/")
public class UserContoller {

    @RequestMapping("/welcome")
    public String welcome() {
        return "UserForm";  //  returns the View -- WEB-INF/jsp/UserForm.jsp
    }

    @RequestMapping(value = "/userAction", method = RequestMethod.POST)
//    public String userService(@RequestParam("id") int id1, @RequestParam("name") String name,@RequestParam("salary") float salary1, ModelMap map
//    ) throws UserException
 public @ResponseBody String userService(@RequestParam("id") int id1, @RequestParam("name") String name,@RequestParam("salary") float salary1, ModelMap map
    ) throws UserException
    {
        User user = new User();
        if(id1<=0)
            throw new UserException("id is blank");
        else if(name.isBlank())
            throw new UserException("name is blank");
        else if(salary1<=0)
            throw new UserException("invalid salary");
        else {
            user.setId(id1);
            user.setName(name);
            user.setSalary(salary1);
            map.addAttribute("user", user);
            return "UserResult";
        }
    }

  @RequestMapping(value = "/userAction1", method = RequestMethod.POST)
  public ModelAndView userService1(@RequestParam("id") int id1, @RequestParam("name") String name, @RequestParam("salary") float salary1, ModelMap map
    ) throws UserException {
        User user = new User();
        if(id1<=0)
            throw new UserException("id is blank");
        else if(name.isBlank())
            throw new UserException("name is blank");
        else if(salary1<=0)
            throw new UserException("invalid salary");
         else {
            user.setId(id1);
            user.setName(name);
            user.setSalary(salary1);
            map.addAttribute("user", user);
            ModelAndView modelAndView = new ModelAndView("UserResult", map);
            return modelAndView;
        }
    }
    @ExceptionHandler(UserException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    //public @ResponseBody String myerror(){
    public  String myerror(){
        return  "error1";
    }

    @ExceptionHandler(NumberFormatException.class)
    public  String myerror2(){
        return  "error2";
    }

//    @ExceptionHandler(Exception.class)
//    public  String myerror1(){
//        return  "error1";
//    }


}
