package com.example.web;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "logout", required = false) String logout, ModelMap map) {
        if(logout!=null)
            map.addAttribute("error","you have successfully logged out");
        return "login"; // Resolves to /WEB-INF/jsp/login.jsp via your application.properties
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout=true";
    }

}

//INSERT INTO CUSTOM_USER (username, password)
//VALUES ('user','$2a$12$4leyAR.ClA1VZo.k7800NObq8ZRd5L13/5CeotFoHCZ1UH1BqClsa');