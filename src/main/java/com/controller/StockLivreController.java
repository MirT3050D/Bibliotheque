package com.controller;
import org.springframework.stereotype.Controller;

import com.entity.StockLivre;
import com.service.StockLivreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stockLivre")
public class StockLivreController {

    private final StockLivreService stockLivreService;

    public StockLivreController(StockLivreService stockLivreService) {
        this.stockLivreService = stockLivreService;
    }

    @PostMapping
    public StockLivre create(@RequestBody StockLivre stockLivre) {
        return stockLivreService.save(stockLivre);
    }

    @GetMapping
    public List<StockLivre> getAll() {
        return stockLivreService.findAll();
    }

    @GetMapping("/{id}")
    public StockLivre getById(@PathVariable Integer id) {
        return stockLivreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        stockLivreService.deleteById(id);
    }
}
