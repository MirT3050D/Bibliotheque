package com.service;

import com.entity.Categorie;
import com.repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public Categorie save(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    public Categorie findById(Integer id) {
        return categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categorie non trouvé"));
    }

    public void deleteById(Integer id) {
        categorieRepository.deleteById(id);
    }
}
