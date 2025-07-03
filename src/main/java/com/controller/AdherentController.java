package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Adherent;
import com.service.AdherentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/adherent")
public class AdherentController {

    private final AdherentService adherentService;

    public AdherentController(AdherentService adherentService) {
        this.adherentService = adherentService;
    }

    @PostMapping
    public Adherent create(@RequestBody Adherent adherent) {
        return adherentService.save(adherent);
    }

    @GetMapping
    public List<Adherent> getAll() {
        return adherentService.findAll();
    }

    @GetMapping("/{id}")

    public Adherent getById(@PathVariable Integer id) {
        return adherentService.findById(id);
    }

    @DeleteMapping("/{id}")

    public void delete(@PathVariable Integer id) {
        adherentService.deleteById(id);
    }

    @GetMapping("/login")
    public String Login()
    {
        return "login";
    }
}
