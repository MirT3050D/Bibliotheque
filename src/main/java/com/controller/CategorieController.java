package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Categorie;
import com.service.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categorie")
public class CategorieController {

    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @PostMapping
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @GetMapping
    public List<Categorie> getAll() {
        return categorieService.findAll();
    }

    @GetMapping("/{id}")
    public Categorie getById(@PathVariable Integer id) {
        return categorieService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categorieService.deleteById(id);
    }
}
