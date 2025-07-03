package com.service;

import com.entity.TypeStatutReservation;
import com.repository.TypeStatutReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeStatutReservationService {
    private final TypeStatutReservationRepository typeStatutReservationRepository;

    public TypeStatutReservationService(TypeStatutReservationRepository typeStatutReservationRepository) {
        this.typeStatutReservationRepository = typeStatutReservationRepository;
    }

    public TypeStatutReservation save(TypeStatutReservation typeStatutReservation) {
        return typeStatutReservationRepository.save(typeStatutReservation);
    }

    public List<TypeStatutReservation> findAll() {
        return typeStatutReservationRepository.findAll();
    }

    public TypeStatutReservation findById(Integer id) {
        return typeStatutReservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TypeStatutReservation non trouvé"));
    }

    public void deleteById(Integer id) {
        typeStatutReservationRepository.deleteById(id);
    }
}
