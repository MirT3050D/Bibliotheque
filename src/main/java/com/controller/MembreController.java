package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Membre;
import com.service.MembreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/membre")
public class MembreController {

    private MembreService membreService;


    
    public String goInscription()
    {
        return "inscription";
    }
     @PostMapping("/save")
    public String enregistrerMembre(@ModelAttribute Membre membre) {
        membreService.save(membre);
        return "redirect:/login"; // ou redirige vers accueil
    }

}
