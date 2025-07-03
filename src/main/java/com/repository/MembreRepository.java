package com.repository;

import com.entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository<Membre, Integer> {
    Membre findByAdresseMail(String adresseMail);
    Membre findById(int id);
    Membre findByNom(String nom);
    Membre findByPrenom(String prenom);
    Membre findByNumTel(String numTel);
}
