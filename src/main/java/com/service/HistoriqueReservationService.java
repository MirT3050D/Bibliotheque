package com.service;

import com.entity.HistoriqueReservation;
import com.repository.HistoriqueReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueReservationService {
    private final HistoriqueReservationRepository historiqueReservationRepository;

    public HistoriqueReservationService(HistoriqueReservationRepository historiqueReservationRepository) {
        this.historiqueReservationRepository = historiqueReservationRepository;
    }

    public HistoriqueReservation save(HistoriqueReservation historiqueReservation) {
        return historiqueReservationRepository.save(historiqueReservation);
    }

    public List<HistoriqueReservation> findAll() {
        return historiqueReservationRepository.findAll();
    }

    public HistoriqueReservation findById(Integer id) {
        return historiqueReservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueReservation non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueReservationRepository.deleteById(id);
    }
}
