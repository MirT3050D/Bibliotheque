package com.service;

import com.entity.CategorieLivre;
import com.repository.CategorieLivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieLivreService {
    private final CategorieLivreRepository categorieLivreRepository;

    public CategorieLivreService(CategorieLivreRepository categorieLivreRepository) {
        this.categorieLivreRepository = categorieLivreRepository;
    }

    public CategorieLivre save(CategorieLivre categorieLivre) {
        return categorieLivreRepository.save(categorieLivre);
    }

    public List<CategorieLivre> findAll() {
        return categorieLivreRepository.findAll();
    }

    public CategorieLivre findById(Integer id) {
        return categorieLivreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CategorieLivre non trouvé"));
    }

    public void deleteById(Integer id) {
        categorieLivreRepository.deleteById(id);
    }
}
