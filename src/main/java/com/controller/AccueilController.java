package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Adherent;
import com.service.AdherentService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AccueilController {
<<<<<<< Updated upstream
    @GetMapping("/login")
    public String goLogin()
    {
        return "login";
    }
=======
>>>>>>> Stashed changes
    @GetMapping("/")
    public String accueil() {

        return "dashboard";
    }
}
