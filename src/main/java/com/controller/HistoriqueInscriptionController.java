package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueInscription;
import com.service.HistoriqueInscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueInscription")
public class HistoriqueInscriptionController {

    private final HistoriqueInscriptionService historiqueInscriptionService;

    public HistoriqueInscriptionController(HistoriqueInscriptionService historiqueInscriptionService) {
        this.historiqueInscriptionService = historiqueInscriptionService;
    }

    @PostMapping
    public HistoriqueInscription create(@RequestBody HistoriqueInscription historiqueInscription) {
        return historiqueInscriptionService.save(historiqueInscription);
    }

    @GetMapping
    public List<HistoriqueInscription> getAll() {
        return historiqueInscriptionService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueInscription getById(@PathVariable Integer id) {
        return historiqueInscriptionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueInscriptionService.deleteById(id);
    }
}
