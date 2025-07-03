package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.TypePret;
import com.service.TypePretService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/typePret")
public class TypePretController {

    private final TypePretService typePretService;

    public TypePretController(TypePretService typePretService) {
        this.typePretService = typePretService;
    }

    @PostMapping
    public TypePret create(@RequestBody TypePret typePret) {
        return typePretService.save(typePret);
    }

    @GetMapping
    public List<TypePret> getAll() {
        return typePretService.findAll();
    }

    @GetMapping("/{id}")
    public TypePret getById(@PathVariable Integer id) {
        return typePretService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        typePretService.deleteById(id);
    }
}
