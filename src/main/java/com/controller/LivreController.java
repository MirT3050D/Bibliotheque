package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Livre;
import com.service.LivreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/livre")
public class LivreController {

    private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @PostMapping
    public Livre create(@RequestBody Livre livre) {
        return livreService.save(livre);
    }

    @GetMapping
    public List<Livre> getAll() {
        return livreService.findAll();
    }

    @GetMapping("/{id}")
    public Livre getById(@PathVariable Integer id) {
        return livreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        livreService.deleteById(id);
    }
}
