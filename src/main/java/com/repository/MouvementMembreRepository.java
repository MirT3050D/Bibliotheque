package com.repository;

import com.entity.MouvementMembre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MouvementMembreRepository extends JpaRepository<MouvementMembre, Integer> {
    public MouvementMembre findById(int id);
}
