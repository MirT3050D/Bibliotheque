package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriquePret;
import com.service.HistoriquePretService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiquePret")
public class HistoriquePretController {

    private final HistoriquePretService historiquePretService;

    public HistoriquePretController(HistoriquePretService historiquePretService) {
        this.historiquePretService = historiquePretService;
    }

    @PostMapping
    public HistoriquePret create(@RequestBody HistoriquePret historiquePret) {
        return historiquePretService.save(historiquePret);
    }

    @GetMapping
    public List<HistoriquePret> getAll() {
        return historiquePretService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriquePret getById(@PathVariable Integer id) {
        return historiquePretService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiquePretService.deleteById(id);
    }
}
