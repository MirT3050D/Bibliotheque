package com.service;

import com.entity.HistoriqueProlongement;
import com.repository.HistoriqueProlongementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueProlongementService {
    private final HistoriqueProlongementRepository historiqueProlongementRepository;

    public HistoriqueProlongementService(HistoriqueProlongementRepository historiqueProlongementRepository) {
        this.historiqueProlongementRepository = historiqueProlongementRepository;
    }

    public HistoriqueProlongement save(HistoriqueProlongement historiqueProlongement) {
        return historiqueProlongementRepository.save(historiqueProlongement);
    }

    public List<HistoriqueProlongement> findAll() {
        return historiqueProlongementRepository.findAll();
    }

    public HistoriqueProlongement findById(Integer id) {
        return historiqueProlongementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueProlongement non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueProlongementRepository.deleteById(id);
    }
}
