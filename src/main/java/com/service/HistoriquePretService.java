package com.service;

import com.entity.HistoriquePret;
import com.repository.HistoriquePretRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriquePretService {
    private final HistoriquePretRepository historiquePretRepository;

    public HistoriquePretService(HistoriquePretRepository historiquePretRepository) {
        this.historiquePretRepository = historiquePretRepository;
    }

    public HistoriquePret save(HistoriquePret historiquePret) {
        return historiquePretRepository.save(historiquePret);
    }

    public List<HistoriquePret> findAll() {
        return historiquePretRepository.findAll();
    }

    public HistoriquePret findById(Integer id) {
        return historiquePretRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriquePret non trouvé"));
    }

    public void deleteById(Integer id) {
        historiquePretRepository.deleteById(id);
    }
}
