package com.repository;

import com.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
}
