package com.service;

import com.entity.HistoriquePenalite;
import com.repository.HistoriquePenaliteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriquePenaliteService {
    private final HistoriquePenaliteRepository historiquePenaliteRepository;

    public HistoriquePenaliteService(HistoriquePenaliteRepository historiquePenaliteRepository) {
        this.historiquePenaliteRepository = historiquePenaliteRepository;
    }

    public HistoriquePenalite save(HistoriquePenalite historiquePenalite) {
        return historiquePenaliteRepository.save(historiquePenalite);
    }

    public List<HistoriquePenalite> findAll() {
        return historiquePenaliteRepository.findAll();
    }

    public HistoriquePenalite findById(Integer id) {
        return historiquePenaliteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriquePenalite non trouvé"));
    }

    public void deleteById(Integer id) {
        historiquePenaliteRepository.deleteById(id);
    }
}
