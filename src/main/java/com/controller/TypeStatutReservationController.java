package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.TypeStatutReservation;
import com.service.TypeStatutReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/typeStatutReservation")
public class TypeStatutReservationController {

    private final TypeStatutReservationService typeStatutReservationService;

    public TypeStatutReservationController(TypeStatutReservationService typeStatutReservationService) {
        this.typeStatutReservationService = typeStatutReservationService;
    }

    @PostMapping
    public TypeStatutReservation create(@RequestBody TypeStatutReservation typeStatutReservation) {
        return typeStatutReservationService.save(typeStatutReservation);
    }

    @GetMapping
    public List<TypeStatutReservation> getAll() {
        return typeStatutReservationService.findAll();
    }

    @GetMapping("/{id}")
    public TypeStatutReservation getById(@PathVariable Integer id) {
        return typeStatutReservationService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        typeStatutReservationService.deleteById(id);
    }
}
