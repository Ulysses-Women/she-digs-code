package com.ulysseswomen.shedigscode.controller;

import com.ulysseswomen.shedigscode.models.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {

    @GetMapping("/profile")
    public String index(){
        return "profile/index";
    }

    @GetMapping("/profile/create")
    public String createProfileForm(Model view){
        view.addAttribute("profile", new Profile());
        return "profile/create";
    }
}
