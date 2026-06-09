package com.amitpathak.medblocks.controller;


//import lombok.Value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/profile")
    public String profile(
            @AuthenticationPrincipal OAuth2User user,
            Model model) {

        model.addAttribute(
                "name",
                user.getAttribute("name"));

        model.addAttribute(
                "email",
                user.getAttribute("email"));

        model.addAttribute(
                "picture",
                user.getAttribute("picture"));

        return "profile";
    }
}