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

    public Membre save(Membre membre) throws RuntimeException {
        if(membreRepository.findByAdresseMail(membre.getAdresseMail()) != null) {
            throw new RuntimeException("Un membre avec cet email existe déjà");
        }
        if(membre.getMdp() == null || membre.getMdp().isEmpty()) {
            throw new RuntimeException("Le mot de passe ne peut pas être vide");
        }
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
    public boolean IsMembre(String email, String password) {
        Membre membre = membreRepository.findByAdresseMail(email);
        if (membre != null && membre.getMdp().equals(password)) {
            return true; // Authentification réussie
        }
        return false; // Échec de l'authentification
    }
    public Membre findByAdresseMail(String adresseMail) {
        return membreRepository.findByAdresseMail(adresseMail);
    }
}
