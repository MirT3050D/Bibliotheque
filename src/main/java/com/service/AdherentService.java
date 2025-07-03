package com.service;

import com.entity.Adherent;
import com.repository.AdherentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdherentService {

    private final AdherentRepository adherentRepository;

    public AdherentService(AdherentRepository adherentRepository) {
        this.adherentRepository = adherentRepository;
    }

    public Adherent save(Adherent adherent) {
        return adherentRepository.save(adherent);
    }

    public List<Adherent> findAll() {
        return adherentRepository.findAll();
    }

    public Adherent findById(Integer id) {
        return adherentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adhérant non trouvé"));
    }

    public void deleteById(Integer id) {
        adherentRepository.deleteById(id);
    }
}
