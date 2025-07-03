package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueReservation;
import com.service.HistoriqueReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueReservation")
public class HistoriqueReservationController {

    private final HistoriqueReservationService historiqueReservationService;

    public HistoriqueReservationController(HistoriqueReservationService historiqueReservationService) {
        this.historiqueReservationService = historiqueReservationService;
    }

    @PostMapping
    public HistoriqueReservation create(@RequestBody HistoriqueReservation historiqueReservation) {
        return historiqueReservationService.save(historiqueReservation);
    }

    @GetMapping
    public List<HistoriqueReservation> getAll() {
        return historiqueReservationService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueReservation getById(@PathVariable Integer id) {
        return historiqueReservationService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueReservationService.deleteById(id);
    }
}
