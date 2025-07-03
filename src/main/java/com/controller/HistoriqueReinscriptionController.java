package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueReinscription;
import com.service.HistoriqueReinscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueReinscription")
public class HistoriqueReinscriptionController {

    private final HistoriqueReinscriptionService historiqueReinscriptionService;

    public HistoriqueReinscriptionController(HistoriqueReinscriptionService historiqueReinscriptionService) {
        this.historiqueReinscriptionService = historiqueReinscriptionService;
    }

    @PostMapping
    public HistoriqueReinscription create(@RequestBody HistoriqueReinscription historiqueReinscription) {
        return historiqueReinscriptionService.save(historiqueReinscription);
    }

    @GetMapping
    public List<HistoriqueReinscription> getAll() {
        return historiqueReinscriptionService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueReinscription getById(@PathVariable Integer id) {
        return historiqueReinscriptionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueReinscriptionService.deleteById(id);
    }
}
