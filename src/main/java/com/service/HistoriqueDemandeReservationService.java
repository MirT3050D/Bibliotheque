package com.service;

import com.entity.HistoriqueDemandeReservation;
import com.repository.HistoriqueDemandeReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueDemandeReservationService {
    private final HistoriqueDemandeReservationRepository historiqueDemandeReservationRepository;

    public HistoriqueDemandeReservationService(HistoriqueDemandeReservationRepository historiqueDemandeReservationRepository) {
        this.historiqueDemandeReservationRepository = historiqueDemandeReservationRepository;
    }

    public HistoriqueDemandeReservation save(HistoriqueDemandeReservation historiqueDemandeReservation) {
        return historiqueDemandeReservationRepository.save(historiqueDemandeReservation);
    }

    public List<HistoriqueDemandeReservation> findAll() {
        return historiqueDemandeReservationRepository.findAll();
    }

    public HistoriqueDemandeReservation findById(Integer id) {
        return historiqueDemandeReservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueDemandeReservation non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueDemandeReservationRepository.deleteById(id);
    }
}
