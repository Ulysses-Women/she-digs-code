package com.ulysseswomen.shedigscode.controllers;

import com.ulysseswomen.shedigscode.models.Profile;
import com.ulysseswomen.shedigscode.repositories.ProfileRepository;
import com.ulysseswomen.shedigscode.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
//
    private final ProfileService profileService;

    public MainController(ProfileService profileService){
        this.profileService = profileService;
    }

    @GetMapping("/profiles")
    public String index(){
        return "profiles/index";
    }

    @GetMapping("/profiles/create")
    public String createProfileForm(Model view){
        view.addAttribute("profile", new Profile());
        return "profiles/create";
    }

    @PostMapping("/profiles/create")
    public String createProfile(@ModelAttribute Profile profile){
        profileService.save(profile);
        return "redirect:/profiles";
    }
}
