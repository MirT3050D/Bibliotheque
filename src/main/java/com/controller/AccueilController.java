package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Adherent;
import com.service.AdherentService;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AccueilController {
    @GetMapping("/login")
    public String goLogin()
    {
        return "login";
    }
    @GetMapping("/")
    public String accueil() {
        return "dashboard";
    }
}
