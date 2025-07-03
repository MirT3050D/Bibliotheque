package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueDemandeProlongement;
import com.service.HistoriqueDemandeProlongementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueDemandeProlongement")
public class HistoriqueDemandeProlongementController {

    private final HistoriqueDemandeProlongementService historiqueDemandeProlongementService;

    public HistoriqueDemandeProlongementController(HistoriqueDemandeProlongementService historiqueDemandeProlongementService) {
        this.historiqueDemandeProlongementService = historiqueDemandeProlongementService;
    }

    @PostMapping
    public HistoriqueDemandeProlongement create(@RequestBody HistoriqueDemandeProlongement historiqueDemandeProlongement) {
        return historiqueDemandeProlongementService.save(historiqueDemandeProlongement);
    }

    @GetMapping
    public List<HistoriqueDemandeProlongement> getAll() {
        return historiqueDemandeProlongementService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueDemandeProlongement getById(@PathVariable Integer id) {
        return historiqueDemandeProlongementService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueDemandeProlongementService.deleteById(id);
    }
}
