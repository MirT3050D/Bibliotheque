package com.service;

import com.entity.Membre;
import com.repository.MembreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreService {
    private final MembreRepository membreRepository;

    public MembreService(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

    public Membre save(Membre membre) {
        return membreRepository.save(membre);
    }

    public List<Membre> findAll() {
        return membreRepository.findAll();
    }

    public Membre findById(Integer id) {
        return membreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membre non trouvé"));
    }

    public void deleteById(Integer id) {
        membreRepository.deleteById(id);
    }
}
