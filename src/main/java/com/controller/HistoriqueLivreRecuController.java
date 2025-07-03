package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.HistoriqueLivreRecu;
import com.service.HistoriqueLivreRecuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historiqueLivreRecu")
public class HistoriqueLivreRecuController {

    private final HistoriqueLivreRecuService historiqueLivreRecuService;

    public HistoriqueLivreRecuController(HistoriqueLivreRecuService historiqueLivreRecuService) {
        this.historiqueLivreRecuService = historiqueLivreRecuService;
    }

    @PostMapping
    public HistoriqueLivreRecu create(@RequestBody HistoriqueLivreRecu historiqueLivreRecu) {
        return historiqueLivreRecuService.save(historiqueLivreRecu);
    }

    @GetMapping
    public List<HistoriqueLivreRecu> getAll() {
        return historiqueLivreRecuService.findAll();
    }

    @GetMapping("/{id}")
    public HistoriqueLivreRecu getById(@PathVariable Integer id) {
        return historiqueLivreRecuService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        historiqueLivreRecuService.deleteById(id);
    }
}
