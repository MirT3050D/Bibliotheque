package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.MouvementMembre;
import com.service.MouvementMembreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mouvementMembre")
public class MouvementMembreController {

    private final MouvementMembreService mouvementMembreService;

    public MouvementMembreController(MouvementMembreService mouvementMembreService) {
        this.mouvementMembreService = mouvementMembreService;
    }

    @PostMapping
    public MouvementMembre create(@RequestBody MouvementMembre mouvementMembre) {
        return mouvementMembreService.save(mouvementMembre);
    }

    @GetMapping
    public List<MouvementMembre> getAll() {
        return mouvementMembreService.findAll();
    }

    @GetMapping("/{id}")
    public MouvementMembre getById(@PathVariable Integer id) {
        return mouvementMembreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        mouvementMembreService.deleteById(id);
    }
}
