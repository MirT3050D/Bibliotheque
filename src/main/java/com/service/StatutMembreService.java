package com.service;

import com.entity.StatutMembre;
import com.repository.StatutMembreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatutMembreService {
    private final StatutMembreRepository statutMembreRepository;

    public StatutMembreService(StatutMembreRepository statutMembreRepository) {
        this.statutMembreRepository = statutMembreRepository;
    }

    public StatutMembre save(StatutMembre statutMembre) {
        return statutMembreRepository.save(statutMembre);
    }

    public List<StatutMembre> findAll() {
        return statutMembreRepository.findAll();
    }

    public StatutMembre findById(Integer id) {
        return statutMembreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StatutMembre non trouvé"));
    }

    public void deleteById(Integer id) {
        statutMembreRepository.deleteById(id);
    }
}
