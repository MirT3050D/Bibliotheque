package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.StatutDemandeProlongement;
import com.service.StatutDemandeProlongementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/statutDemandeProlongement")
public class StatutDemandeProlongementController {

    private final StatutDemandeProlongementService statutDemandeProlongementService;

    public StatutDemandeProlongementController(StatutDemandeProlongementService statutDemandeProlongementService) {
        this.statutDemandeProlongementService = statutDemandeProlongementService;
    }

    @PostMapping
    public StatutDemandeProlongement create(@RequestBody StatutDemandeProlongement statutDemandeProlongement) {
        return statutDemandeProlongementService.save(statutDemandeProlongement);
    }

    @GetMapping
    public List<StatutDemandeProlongement> getAll() {
        return statutDemandeProlongementService.findAll();
    }

    @GetMapping("/{id}")
    public StatutDemandeProlongement getById(@PathVariable Integer id) {
        return statutDemandeProlongementService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        statutDemandeProlongementService.deleteById(id);
    }
}
