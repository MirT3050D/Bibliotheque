package com.repository;

import com.entity.StatutMembre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatutMembreRepository extends JpaRepository<StatutMembre, Integer> {
    StatutMembre findById(int id);
}
