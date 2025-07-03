package com.service;

import com.entity.Livre;
import com.repository.LivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    private final LivreRepository livreRepository;

    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public Livre save(Livre livre) {
        return livreRepository.save(livre);
    }

    public List<Livre> findAll() {
        return livreRepository.findAll();
    }

    public Livre findById(Integer id) {
        return livreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livre non trouvé"));
    }

    public void deleteById(Integer id) {
        livreRepository.deleteById(id);
    }
}
