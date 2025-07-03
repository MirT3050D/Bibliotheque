package com.service;

import com.entity.StockLivre;
import com.repository.StockLivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockLivreService {
    private final StockLivreRepository stockLivreRepository;

    public StockLivreService(StockLivreRepository stockLivreRepository) {
        this.stockLivreRepository = stockLivreRepository;
    }

    public StockLivre save(StockLivre stockLivre) {
        return stockLivreRepository.save(stockLivre);
    }

    public List<StockLivre> findAll() {
        return stockLivreRepository.findAll();
    }

    public StockLivre findById(Integer id) {
        return stockLivreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StockLivre non trouvé"));
    }

    public void deleteById(Integer id) {
        stockLivreRepository.deleteById(id);
    }
}
