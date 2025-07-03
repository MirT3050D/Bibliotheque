package com.service;

import com.entity.MouvementMembre;
import com.repository.MouvementMembreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MouvementMembreService {
    private final MouvementMembreRepository mouvementMembreRepository;

    public MouvementMembreService(MouvementMembreRepository mouvementMembreRepository) {
        this.mouvementMembreRepository = mouvementMembreRepository;
    }

    public MouvementMembre save(MouvementMembre mouvementMembre) {
        return mouvementMembreRepository.save(mouvementMembre);
    }

    public List<MouvementMembre> findAll() {
        return mouvementMembreRepository.findAll();
    }

    public MouvementMembre findById(Integer id) {
        return mouvementMembreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MouvementMembre non trouvé"));
    }

    public void deleteById(Integer id) {
        mouvementMembreRepository.deleteById(id);
    }
}
