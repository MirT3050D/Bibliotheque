package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueProlongement;
import com.service.HistoriqueProlongementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueProlongement")
public class HistoriqueProlongementController {

    private final HistoriqueProlongementService historiqueProlongementService;

    public HistoriqueProlongementController(HistoriqueProlongementService historiqueProlongementService) {
        this.historiqueProlongementService = historiqueProlongementService;
    }

    @PostMapping
    public HistoriqueProlongement create(@RequestBody HistoriqueProlongement historiqueProlongement) {
        return historiqueProlongementService.save(historiqueProlongement);
    }

    @GetMapping
    public List<HistoriqueProlongement> getAll() {
        return historiqueProlongementService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueProlongement getById(@PathVariable Integer id) {
        return historiqueProlongementService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueProlongementService.deleteById(id);
    }
}
