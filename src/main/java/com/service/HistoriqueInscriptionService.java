package com.service;

import com.entity.HistoriqueInscription;
import com.repository.HistoriqueInscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueInscriptionService {
    private final HistoriqueInscriptionRepository historiqueInscriptionRepository;

    public HistoriqueInscriptionService(HistoriqueInscriptionRepository historiqueInscriptionRepository) {
        this.historiqueInscriptionRepository = historiqueInscriptionRepository;
    }

    public HistoriqueInscription save(HistoriqueInscription historiqueInscription) {
        return historiqueInscriptionRepository.save(historiqueInscription);
    }

    public List<HistoriqueInscription> findAll() {
        return historiqueInscriptionRepository.findAll();
    }

    public HistoriqueInscription findById(Integer id) {
        return historiqueInscriptionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueInscription non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueInscriptionRepository.deleteById(id);
    }
}
