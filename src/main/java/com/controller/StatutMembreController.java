package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.StatutMembre;
import com.service.StatutMembreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/statutMembre")
public class StatutMembreController {

    private final StatutMembreService statutMembreService;

    public StatutMembreController(StatutMembreService statutMembreService) {
        this.statutMembreService = statutMembreService;
    }

    @PostMapping
    public StatutMembre create(@RequestBody StatutMembre statutMembre) {
        return statutMembreService.save(statutMembre);
    }

    @GetMapping
    public List<StatutMembre> getAll() {
        return statutMembreService.findAll();
    }

    @GetMapping("/{id}")
    public StatutMembre getById(@PathVariable Integer id) {
        return statutMembreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        statutMembreService.deleteById(id);
    }
}
