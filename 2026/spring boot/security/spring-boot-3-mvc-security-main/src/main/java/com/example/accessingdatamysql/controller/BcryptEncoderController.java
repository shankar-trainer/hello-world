package com.example.accessingdatamysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Controller
public class BcryptEncoderController {

    @GetMapping("/bcrypt")
    public String bcrypt(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
       
        // Just for test my app!
        String password = "persteen1967";

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
		String hashedPassword = passwordEncoder.encode(password);
        
        //System.out.println(hashedPassword);
		        
        model.addAttribute("name", hashedPassword );
        return "bcrypt_password_encoder";
        
    }

}