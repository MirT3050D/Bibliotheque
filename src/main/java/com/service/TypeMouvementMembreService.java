package com.service;

import com.entity.TypeMouvementMembre;
import com.repository.TypeMouvementMembreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeMouvementMembreService {
    private final TypeMouvementMembreRepository typeMouvementMembreRepository;

    public TypeMouvementMembreService(TypeMouvementMembreRepository typeMouvementMembreRepository) {
        this.typeMouvementMembreRepository = typeMouvementMembreRepository;
    }

    public TypeMouvementMembre save(TypeMouvementMembre typeMouvementMembre) {
        return typeMouvementMembreRepository.save(typeMouvementMembre);
    }

    public List<TypeMouvementMembre> findAll() {
        return typeMouvementMembreRepository.findAll();
    }

    public TypeMouvementMembre findById(Integer id) {
        return typeMouvementMembreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TypeMouvementMembre non trouvé"));
    }

    public void deleteById(Integer id) {
        typeMouvementMembreRepository.deleteById(id);
    }
}
