package com.service;

import com.entity.HistoriqueDemandeProlongement;
import com.repository.HistoriqueDemandeProlongementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueDemandeProlongementService {
    private final HistoriqueDemandeProlongementRepository historiqueDemandeProlongementRepository;

    public HistoriqueDemandeProlongementService(HistoriqueDemandeProlongementRepository historiqueDemandeProlongementRepository) {
        this.historiqueDemandeProlongementRepository = historiqueDemandeProlongementRepository;
    }

    public HistoriqueDemandeProlongement save(HistoriqueDemandeProlongement historiqueDemandeProlongement) {
        return historiqueDemandeProlongementRepository.save(historiqueDemandeProlongement);
    }

    public List<HistoriqueDemandeProlongement> findAll() {
        return historiqueDemandeProlongementRepository.findAll();
    }

    public HistoriqueDemandeProlongement findById(Integer id) {
        return historiqueDemandeProlongementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueDemandeProlongement non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueDemandeProlongementRepository.deleteById(id);
    }
}
