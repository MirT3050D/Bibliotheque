package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriquePenalite;
import com.service.HistoriquePenaliteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiquePenalite")
public class HistoriquePenaliteController {

    private final HistoriquePenaliteService historiquePenaliteService;

    public HistoriquePenaliteController(HistoriquePenaliteService historiquePenaliteService) {
        this.historiquePenaliteService = historiquePenaliteService;
    }

    @PostMapping
    public HistoriquePenalite create(@RequestBody HistoriquePenalite historiquePenalite) {
        return historiquePenaliteService.save(historiquePenalite);
    }

    @GetMapping
    public List<HistoriquePenalite> getAll() {
        return historiquePenaliteService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriquePenalite getById(@PathVariable Integer id) {
        return historiquePenaliteService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiquePenaliteService.deleteById(id);
    }
}
