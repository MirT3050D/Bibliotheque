package com.service;

import com.entity.HistoriqueReinscription;
import com.repository.HistoriqueReinscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueReinscriptionService {
    private final HistoriqueReinscriptionRepository historiqueReinscriptionRepository;

    public HistoriqueReinscriptionService(HistoriqueReinscriptionRepository historiqueReinscriptionRepository) {
        this.historiqueReinscriptionRepository = historiqueReinscriptionRepository;
    }

    public HistoriqueReinscription save(HistoriqueReinscription historiqueReinscription) {
        return historiqueReinscriptionRepository.save(historiqueReinscription);
    }

    public List<HistoriqueReinscription> findAll() {
        return historiqueReinscriptionRepository.findAll();
    }

    public HistoriqueReinscription findById(Integer id) {
        return historiqueReinscriptionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueReinscription non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueReinscriptionRepository.deleteById(id);
    }
}
