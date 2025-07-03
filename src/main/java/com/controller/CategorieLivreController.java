package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.CategorieLivre;
import com.service.CategorieLivreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categorieLivre")
public class CategorieLivreController {

    private final CategorieLivreService categorieLivreService;

    public CategorieLivreController(CategorieLivreService categorieLivreService) {
        this.categorieLivreService = categorieLivreService;
    }

    @PostMapping
    public CategorieLivre create(@RequestBody CategorieLivre categorieLivre) {
        return categorieLivreService.save(categorieLivre);
    }

    @GetMapping
    public List<CategorieLivre> getAll() {
        return categorieLivreService.findAll();
    }

    @GetMapping("/{id}")
    public CategorieLivre getById(@PathVariable Integer id) {
        return categorieLivreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categorieLivreService.deleteById(id);
    }
}
