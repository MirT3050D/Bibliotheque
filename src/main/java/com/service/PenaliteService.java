package com.service;

import com.entity.Penalite;
import com.repository.PenaliteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenaliteService {
    private final PenaliteRepository penaliteRepository;

    public PenaliteService(PenaliteRepository penaliteRepository) {
        this.penaliteRepository = penaliteRepository;
    }

    public Penalite save(Penalite penalite) {
        return penaliteRepository.save(penalite);
    }

    public List<Penalite> findAll() {
        return penaliteRepository.findAll();
    }

    public Penalite findById(Integer id) {
        return penaliteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Penalite non trouvé"));
    }

    public void deleteById(Integer id) {
        penaliteRepository.deleteById(id);
    }
}
