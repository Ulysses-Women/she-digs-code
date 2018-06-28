package com.ulysseswomen.shedigscode.controllers;

import com.ulysseswomen.shedigscode.models.Profile;
import com.ulysseswomen.shedigscode.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
//
    private final ProfileRepository profileDao;

    public MainController(ProfileRepository profileDao){
        this.profileDao = profileDao;
    }

    @GetMapping("/profiles")
    public String index(){
        return "profile/index";
    }

//    @GetMapping("/profile/create")
//    public String createProfileForm(Model view){
//        view.addAttribute("profile", new Profile());
//        return "profile/create";
//    }

//    @PostMapping("/profile/create")
//    public String createProfile(@ModelAttribute Profile profile){
//        profileDao.save(profile);
//        return "redirect:/profiles";
//    }
}
