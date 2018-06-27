package com.ulysseswomen.shedigscode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {


    @GetMapping("/profiles")
    public String index(){
        return "profiles";
    }
}
