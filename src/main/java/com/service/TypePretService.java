package com.service;

import com.entity.TypePret;
import com.repository.TypePretRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePretService {
    private final TypePretRepository typePretRepository;

    public TypePretService(TypePretRepository typePretRepository) {
        this.typePretRepository = typePretRepository;
    }

    public TypePret save(TypePret typePret) {
        return typePretRepository.save(typePret);
    }

    public List<TypePret> findAll() {
        return typePretRepository.findAll();
    }

    public TypePret findById(Integer id) {
        return typePretRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TypePret non trouvé"));
    }

    public void deleteById(Integer id) {
        typePretRepository.deleteById(id);
    }
}
