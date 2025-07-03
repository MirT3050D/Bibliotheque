package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueDemandeReservation;
import com.service.HistoriqueDemandeReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueDemandeReservation")
public class HistoriqueDemandeReservationController {

    private final HistoriqueDemandeReservationService historiqueDemandeReservationService;

    public HistoriqueDemandeReservationController(HistoriqueDemandeReservationService historiqueDemandeReservationService) {
        this.historiqueDemandeReservationService = historiqueDemandeReservationService;
    }

    @PostMapping
    public HistoriqueDemandeReservation create(@RequestBody HistoriqueDemandeReservation historiqueDemandeReservation) {
        return historiqueDemandeReservationService.save(historiqueDemandeReservation);
    }

    @GetMapping
    public List<HistoriqueDemandeReservation> getAll() {
        return historiqueDemandeReservationService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueDemandeReservation getById(@PathVariable Integer id) {
        return historiqueDemandeReservationService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueDemandeReservationService.deleteById(id);
    }
}
