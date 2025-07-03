package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.TypeMouvementMembre;
import com.service.TypeMouvementMembreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/typeMouvementMembre")
public class TypeMouvementMembreController {

    private final TypeMouvementMembreService typeMouvementMembreService;

    public TypeMouvementMembreController(TypeMouvementMembreService typeMouvementMembreService) {
        this.typeMouvementMembreService = typeMouvementMembreService;
    }

    @PostMapping
    public TypeMouvementMembre create(@RequestBody TypeMouvementMembre typeMouvementMembre) {
        return typeMouvementMembreService.save(typeMouvementMembre);
    }

    @GetMapping
    public List<TypeMouvementMembre> getAll() {
        return typeMouvementMembreService.findAll();
    }

    @GetMapping("/{id}")
    public TypeMouvementMembre getById(@PathVariable Integer id) {
        return typeMouvementMembreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        typeMouvementMembreService.deleteById(id);
    }
}
