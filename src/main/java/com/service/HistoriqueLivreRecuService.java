package com.service;

import com.entity.HistoriqueLivreRecu;
import com.repository.HistoriqueLivreRecuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueLivreRecuService {
    private final HistoriqueLivreRecuRepository historiqueLivreRecuRepository;

    public HistoriqueLivreRecuService(HistoriqueLivreRecuRepository historiqueLivreRecuRepository) {
        this.historiqueLivreRecuRepository = historiqueLivreRecuRepository;
    }

    public HistoriqueLivreRecu save(HistoriqueLivreRecu historiqueLivreRecu) {
        return historiqueLivreRecuRepository.save(historiqueLivreRecu);
    }

    public List<HistoriqueLivreRecu> findAll() {
        return historiqueLivreRecuRepository.findAll();
    }

    public HistoriqueLivreRecu findById(Integer id) {
        return historiqueLivreRecuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HistoriqueLivreRecu non trouvé"));
    }

    public void deleteById(Integer id) {
        historiqueLivreRecuRepository.deleteById(id);
    }
}
