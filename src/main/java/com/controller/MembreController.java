package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Adherent;
import com.entity.Membre;
import com.entity.MouvementMembre;
import com.service.MembreService;
import com.service.MouvementMembreService;
import com.service.StatutMembreService;
import com.service.TypeMouvementMembreService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.*;
import com.service.AdherentService;
import org.springframework.ui.Model;

import java.lang.reflect.Type;
import java.util.List;

@Controller
@RequestMapping("/membre")
public class MembreController {
    @Autowired
    private MembreService membreService;
    @Autowired
    private AdherentService adherentService;
    @Autowired
    private MouvementMembreService mouvementMembreService;
    @Autowired
    private TypeMouvementMembreService typeMouvementMembreService;
    @Autowired
    private StatutMembreService statutMembreService;


    @GetMapping("/inscription")
    public String goInscription(Model model)
    {
        List<Adherent> adherents = adherentService.findAll(); // Assurez-vous d'avoir une méthode pour récupérer les adhérents
        model.addAttribute("adherents", adherents);
        return "inscription";
    }
     @PostMapping("/enregistrer")
    public String enregistrerMembre(@ModelAttribute Membre membre,@RequestParam String idAdherent) {
        membre.setIdAdherent(adherentService.findById(Integer.valueOf(idAdherent)));
        membre.setIdStatus(statutMembreService.findById(1)); // Assurez-vous que le type de membre est défini correctement
        membreService.save(membre);
        MouvementMembre mouvementMembre = new MouvementMembre();
        mouvementMembre.setIdMembre(membre);
        mouvementMembre.setIdTypeMouvement(typeMouvementMembreService.findById(1));
        mouvementMembreService.save(mouvementMembre);
        return "redirect:login"; // ou redirige vers accueil
    }
    @GetMapping("/login")
    public String Login() {
        return "login";
    }
    @PostMapping("checkLogin")
    public String checkLogin(@RequestParam String email, @RequestParam String password, HttpSession session) {
        if (membreService.IsMembre(email, password)) {
            System.out.println("Authentification réussie pour l'email: " + email);
            session.setAttribute("id", membreService.findByAdresseMail(email)); // Stocke l'email dans la session
            return "redirect:/"; // Redirige vers la page d'accueil si l'authentification réussit
        } else {
            System.out.println("Échec de l'authentification pour l'email: " + email);
            return "redirect:login"; // Redirige vers la page de login si l'authentification échoue
        }
    }

}
