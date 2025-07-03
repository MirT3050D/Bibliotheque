package com.service;

import com.entity.StatutDemandeProlongement;
import com.repository.StatutDemandeProlongementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatutDemandeProlongementService {
    private final StatutDemandeProlongementRepository statutDemandeProlongementRepository;

    public StatutDemandeProlongementService(StatutDemandeProlongementRepository statutDemandeProlongementRepository) {
        this.statutDemandeProlongementRepository = statutDemandeProlongementRepository;
    }

    public StatutDemandeProlongement save(StatutDemandeProlongement statutDemandeProlongement) {
        return statutDemandeProlongementRepository.save(statutDemandeProlongement);
    }

    public List<StatutDemandeProlongement> findAll() {
        return statutDemandeProlongementRepository.findAll();
    }

    public StatutDemandeProlongement findById(Integer id) {
        return statutDemandeProlongementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StatutDemandeProlongement non trouvé"));
    }

    public void deleteById(Integer id) {
        statutDemandeProlongementRepository.deleteById(id);
    }
}
