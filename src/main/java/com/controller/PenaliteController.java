package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.Penalite;
import com.service.PenaliteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/penalite")
public class PenaliteController {

    private final PenaliteService penaliteService;

    public PenaliteController(PenaliteService penaliteService) {
        this.penaliteService = penaliteService;
    }

    @PostMapping
    public Penalite create(@RequestBody Penalite penalite) {
        return penaliteService.save(penalite);
    }

    @GetMapping
    public List<Penalite> getAll() {
        return penaliteService.findAll();
    }

    @GetMapping("/{id}")
    public Penalite getById(@PathVariable Integer id) {
        return penaliteService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        penaliteService.deleteById(id);
    }
}
